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
import utility.EmailManager;

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
		String email = (String) session.getAttribute("Email");
		int idEvento = Integer.valueOf(request.getParameter("eventoID"));
		int postiDaPrenotare = Integer.valueOf(request.getParameter("Postiprenotazione"));
		if(utente == null) {
			session.removeAttribute("Evento");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);
			return;
		}
		EventoDAO k = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		PartecipazioneDAO c = DatabaseManager.getInstance().getDaoFactory().getPartecipazioneDAO();
		c.save(new Partecipazione(utente,idEvento,postiDaPrenotare));
		Evento temp = k.findByPrimaryKey(request.getParameter("eventoID"));
		temp.setNumattualeprenotati(temp.getNumattualeprenotati() + postiDaPrenotare);
		k.update(temp);
		
		EmailManager em = new EmailManager();
	    em.partecipazioneEmail(utente,email,temp,postiDaPrenotare);
		
		session.removeAttribute("Evento");
		RequestDispatcher rd = request.getRequestDispatcher("eventoconfermato.html");
		rd.forward(request, response);
	}

}
