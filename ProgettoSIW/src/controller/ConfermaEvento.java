package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Evento;
import model.Partecipazione;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.PartecipazioneDAO;

/**
 * Servlet implementation class ConfermaEvento
 */
@WebServlet("/ConfermaEvento")
public class ConfermaEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfermaEvento() {
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
		int idEvento = Integer.valueOf(request.getParameter("eventoID"));
		int postiDaPrenotare = Integer.valueOf(request.getParameter("Postiprenotazione"));
		System.out.println("utente: "+utente);
		System.out.println("idEvento "+idEvento);
		System.out.println("posti: "+postiDaPrenotare);
		EventoDAO k = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO c = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		c.save(new Partecipazione(utente,idEvento,postiDaPrenotare));
		Evento temp = k.findByPrimaryKey(request.getParameter("eventoID"));
		temp.setNumattualeprenotati(temp.getNumattualeprenotati() + postiDaPrenotare);
		k.update(temp);
		session.removeAttribute("Evento");
		RequestDispatcher rd = request.getRequestDispatcher("eventoconfermato.html");
		rd.forward(request, response);
	}

}
