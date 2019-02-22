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
		float numeroEventi = t.sizeEventi();
		float numeroUtenti = k.sizeUtenti();
		float cinema = (t.sizeByCategoria("Cinema")/numeroEventi)*100;
		float convegni = (t.sizeByCategoria("Convegni")/numeroEventi)*100;;
		float feste = (t.sizeByCategoria("Feste")/numeroEventi)*100;;
		float musica = (t.sizeByCategoria("Musica")/numeroEventi)*100;
		float istruzione = (t.sizeByCategoria("Istruzione")/numeroEventi)*100;;
		float sport = (t.sizeByCategoria("Sport")/numeroEventi)*100;;
		float teatro = (t.sizeByCategoria("Teatro")/numeroEventi)*100;;
		float viaggi = (t.sizeByCategoria("Viaggi")/numeroEventi)*100;;
		
		List<Float> statistiche = new ArrayList<>();
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
