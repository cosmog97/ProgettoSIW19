package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Evento;
import model.Partecipazione;
import model.Utente;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.PartecipazioneDAO;
import persistance.UtenteDAO;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;

/**
 * Servlet implementation class CercaEventi
 */
@WebServlet("/CercaEventi")
public class CercaEventi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CercaEventi() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonArray data = new Gson().fromJson(request.getReader(), JsonArray.class);
		HttpSession session = request.getSession();
		String utente = (String) session.getAttribute("Username");
		
		String nomeEvento =  data.get(0).getAsString();
		String categoriaEvento = data.get(1).getAsString();
		String creatoreEvento = data.get(2).getAsString();
		int postiDisponibiliEvento = 0;
		if (!data.get(4).getAsString().equals("")) {
			postiDisponibiliEvento = data.get(4).getAsInt();
		}


		String provinciaEvento = data.get(5).getAsString();
		String cittaEvento = data.get(6).getAsString();
		String dataEvento = data.get(3).getAsString();
	
		Timestamp dataAttuale = new Timestamp(System.currentTimeMillis());
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO c = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		List<Evento> temp;
		List<Evento> daEliminare = new ArrayList<Evento>();
		if (utente != null && utente != "") {
			temp = t.findAllByDifferentCreator(utente, dataAttuale);
			for (Evento i : temp) {
				Partecipazione k = c.findByUtenteIdEvento(utente, i.getId());
				if (k != null) {
					daEliminare.add(i);
				}
			}
			
		}
		else  {
			temp = t.findAllwithDate(dataAttuale);
		}


		//_____SORTING_______//
		if (!nomeEvento.equals(null)) {
			for (Evento i : temp) {
				if(!i.getNome().toLowerCase().contains(nomeEvento.toLowerCase())) {
					daEliminare.add(i);
				}
			}
		}
		if (!categoriaEvento.equals(null) && !categoriaEvento.equals("Qualsiasi")) {
			for (Evento i : temp) {
				if(!i.getCategoria().contains(categoriaEvento)) {
					daEliminare.add(i);
				}
			}
		}
		if (!creatoreEvento.equals(null)) {
			for (Evento i : temp) {
				if(!i.getCreatore().toLowerCase().contains(creatoreEvento.toLowerCase())) {
					daEliminare.add(i);
				}
			}
		}
		if (postiDisponibiliEvento > 0) {
			for (Evento i : temp) {
				if(i.getNummaxprenotati() - i.getNumattualeprenotati() < 0 ||
				  i.getNummaxprenotati() - i.getNumattualeprenotati() < postiDisponibiliEvento) {
					daEliminare.add(i);
				}
			}
		}
		if (!provinciaEvento.equals(null)) {
			for (Evento i : temp) {
				if(!i.getProvincia().contains(provinciaEvento)) {
					daEliminare.add(i);
				}
			}
		}
		if (!cittaEvento.equals(null)) {
			for (Evento i : temp) {
				if(!i.getCitta().toLowerCase().contains(cittaEvento.toLowerCase())) {
					daEliminare.add(i);
				}
			}
		}
		if (!dataEvento.equals("")) {
			for (Evento i : temp) {
				if(i.getInizio().before(Date.valueOf(dataEvento))) {
					daEliminare.add(i);
				}
			}
		}

		
		temp.removeAll(daEliminare);
		
		//__________________//
		Gson gson = new Gson();
	    String json = gson.toJson(temp);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	}

}
