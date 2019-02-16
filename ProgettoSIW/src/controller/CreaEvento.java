package controller;

import java.io.IOException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Evento;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.UtenteDAO;

/**
 * Servlet implementation class CreaEvento
 */
@WebServlet("/CreaEvento")
public class CreaEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CreaEvento() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		Timestamp dataAttuale = new Timestamp(System.currentTimeMillis());
		String creatore = (String)session.getAttribute("Username");
		
		
		java.sql.Timestamp inizio = java.sql.Timestamp.valueOf(request.getParameter("Datainizio"));
		java.sql.Timestamp fine = java.sql.Timestamp.valueOf(request.getParameter("DataFine")); //prova
		java.sql.Timestamp scadenza = java.sql.Timestamp.valueOf(request.getParameter("DataScadenza")); //prova
		
		
	   
	    EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		//fare controlli su pk
		Evento evento = new Evento();
		
		evento.setNome(request.getParameter("NomeEvento"));
		evento.setCategoria(request.getParameter("CategoriaEvento"));
		evento.setNumattualeprenotati(1);
		evento.setNummaxprenotati(4);
		evento.setInizio(inizio);
		evento.setFine(fine);
		evento.setCreazione(dataAttuale);
		evento.setScadenza(scadenza);
		evento.setCreatore(creatore);
		evento.setProvincia(request.getParameter("Provincia"));
		evento.setCitta(request.getParameter("Citta"));
		
		t.save(evento);
		
		System.out.println("EVENTO CREATO"+evento.getCreatore()+" "+evento.getProvincia()+" "+evento.getScadenza());
		
		RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
		rd.forward(request, response);
		
		
	}

}