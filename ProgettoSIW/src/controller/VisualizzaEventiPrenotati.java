package controller;

import java.io.IOException;
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

/**
 * Servlet implementation class VisualizzaEventiPrenotati
 */
@WebServlet("/VisualizzaEventiPrenotati")
public class VisualizzaEventiPrenotati extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VisualizzaEventiPrenotati() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String utente = (String) session.getAttribute("Username");
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO k = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		List<Partecipazione> partecipazioni = k.findPrenotazioni(utente);
		List<Evento> eventi = new ArrayList<Evento>();
		for (Partecipazione i : partecipazioni) {
			Evento test = t.findByPrimaryKey(String.valueOf(i.getIdEvento()));
			test.setNumattualeprenotati(i.getPostiPrenotati());
			eventi.add(test);
		}
		
		Gson gson = new Gson();
	    String json = gson.toJson(eventi);

	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);

	}

}
