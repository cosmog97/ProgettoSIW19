package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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
import model.Utente;
import persistance.DatabaseManager;
import persistance.EventoDAO;
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
		String dataEvento = data.get(3).getAsString();
		java.util.Date date = null;
		try {
			if (dataEvento != null && dataEvento != "" && dataEvento.equals(null)) {
				date = new SimpleDateFormat("yyyy-MM-dd").parse(dataEvento);
			}
		} catch (ParseException e) { e.printStackTrace();}
		Date sqlDate = null;
		if (date != null) {
			sqlDate = new Date(date.getTime());
		}
		System.out.println(sqlDate);
		String postiDisponibiliEvento = data.get(4).getAsString();
		String provinciaEvento = data.get(5).getAsString();
		String cittaEvento = data.get(6).getAsString();
		//Date dataAttuale = new Date(System.currentTimeMillis());
		Timestamp dataAttuale = new Timestamp(System.currentTimeMillis());
		System.out.println(dataAttuale);
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		List<Evento> temp;
		if (utente != null && utente != "") {
			temp = t.findAllByDifferentCreator(utente, dataAttuale);
		}
		else  {
			temp = t.findAllwithDate(dataAttuale);
		}
		
		
		
		
		
		
		Gson gson = new Gson();
	    String json = gson.toJson(temp);
	    System.out.println(json);
	    System.out.println("json creato con write");
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    System.out.println("json inviato");
	}

}
