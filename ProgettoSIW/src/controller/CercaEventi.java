package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Evento;
import model.Utente;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import persistance.UtenteDAO;

import org.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
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
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		List<Evento> temp = t.findAll();
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
