package controller;

import java.io.IOException;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;

import model.Evento;
import model.Partecipazione;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.PartecipazioneDAO;
import persistance.UtenteDAO;

/**
 * Servlet implementation class RiepilogoUtente
 */
@WebServlet("/RiepilogoUtente")
public class RiepilogoUtente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RiepilogoUtente() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String utente = (String) session.getAttribute("Username");
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO k = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		List<Partecipazione> temp = k.findPrenotazioni(utente);
		List<Evento> temp2 = t.findAllByCreator(utente);
		List<Evento> temp3 = new ArrayList<>();
		Timestamp dataAttuale = new Timestamp(System.currentTimeMillis());
		for (Partecipazione i : temp) {
			Evento l = t.findByPrimaryKey(String.valueOf(i.getIdEvento()));
			if(l.getScadenza().after(dataAttuale)){
				temp3.add(l);
			}
			
		}
		int numPrenotati = temp.size();
		int numCreati = temp2.size();
		int numScadenza = temp3.size();
		String nomeEvento = temp3.get(0).getNome();
		
		List<Object> test = new ArrayList<>();
		test.add(numPrenotati);
		test.add(numCreati);
		test.add(numScadenza);
		test.add(nomeEvento);
		
		Gson gson = new Gson();
	    String json = gson.toJson(test);
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	}

}
