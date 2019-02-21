package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.PartecipazioneDAO;

/**
 * Servlet implementation class EliminaEventoCreatore
 */
@WebServlet("/EliminaEventoCreatore")
public class EliminaEventoCreatore extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminaEventoCreatore() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		JsonElement data = new Gson().fromJson(request.getReader(), JsonElement.class);
		HttpSession session = request.getSession();
		String utente = (String) session.getAttribute("Username");
		String emailUtente = (String) session.getAttribute("Email");
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO k = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		//___lista di emailprenotati____
		List<String> emailPrenotati = k.getEmailByEvento(data.getAsInt());

		System.out.println("Email creatore: "+emailUtente);
		System.out.println("Id Evento da eliminare: "+data);
		k.deleteByIdEvento(data.getAsInt());
		t.delete(data.getAsInt());
		System.out.println("Evento eliminato");
	}

}
