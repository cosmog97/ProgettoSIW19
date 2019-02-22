package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import model.Evento;
import model.Partecipazione;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.PartecipazioneDAO;

/**
 * Servlet implementation class EliminaPrenotazione
 */
@WebServlet("/EliminaPrenotazione")
public class EliminaPrenotazione extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminaPrenotazione() {
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
		JsonElement data = new Gson().fromJson(request.getReader(), JsonElement.class);
		HttpSession session = request.getSession();
		String utente = (String) session.getAttribute("Username");
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO k = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		Partecipazione PdaEliminare = k.findByUtenteIdEvento(utente, data.getAsInt());
		Evento EdaEliminare = t.findByPrimaryKey(data.getAsString());
		EdaEliminare.setNumattualeprenotati(EdaEliminare.getNumattualeprenotati() - PdaEliminare.getPostiPrenotati());
		t.update(EdaEliminare);
		k.delete(PdaEliminare);
		
	}

}
