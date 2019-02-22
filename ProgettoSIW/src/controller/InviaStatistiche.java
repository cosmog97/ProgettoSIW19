package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.UtenteDAO;

/**
 * Servlet implementation class InviaStatistiche
 */
@WebServlet("/InviaStatistiche")
public class InviaStatistiche extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InviaStatistiche() {
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
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		UtenteDAO k = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		int numeroEventi = t.sizeEventi();
		int numeroUtenti = k.sizeUtenti();
		int cinema = t.sizeByCategoria("Cinema");
		int convegni = t.sizeByCategoria("Convegni");
		int feste = t.sizeByCategoria("Feste");
		int musica = t.sizeByCategoria("Musica");
		int istruzione = t.sizeByCategoria("Istruzione");
		int sport = t.sizeByCategoria("Sport");
		int teatro = t.sizeByCategoria("Teatro");
		int viaggi = t.sizeByCategoria("Viaggi");
		
		List<Integer> statistiche = new ArrayList<>();
		statistiche.add(cinema);
		statistiche.add(convegni);
		statistiche.add(feste);
		statistiche.add(musica);
		statistiche.add(istruzione);
		statistiche.add(sport);
		statistiche.add(teatro);
		statistiche.add(viaggi);
		statistiche.add(numeroEventi);
		statistiche.add(numeroUtenti);
		Gson gson = new Gson();
	    String json = gson.toJson(statistiche);
	    System.out.println("json creato");
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    System.out.println("json inviato");
		
	}

}
