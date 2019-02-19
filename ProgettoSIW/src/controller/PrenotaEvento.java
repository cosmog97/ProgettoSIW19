package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;

import model.Evento;
import persistance.DatabaseManager;
import persistance.EventoDAO;
import utility.EmailManager;

/**
 * Servlet implementation class PrenotaEvento
 */
@WebServlet("/PrenotaEvento")
public class PrenotaEvento extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PrenotaEvento() {
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
		JsonElement data = new Gson().fromJson(request.getReader(), JsonElement.class);
		HttpSession session = request.getSession();
		
		String utente = (String) session.getAttribute("Username");
		String email = (String)session.getAttribute("Email");
		String creatore = (String)session.getAttribute("Creatore");
		String luogo = (String)session.getAttribute("Citta");
		
		
		System.out.println("ID:" + data + "  utente: "+utente);
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		Evento temp = t.findByPrimaryKey(data.toString());
		Gson gson = new Gson();
	    String json = gson.toJson(temp);
	    
	    EmailManager em = new EmailManager();
	    em.partecipazioneEmail(utente,email,temp.getCreatore(),temp.getCitta(),temp.getInizio());
	  /*  System.out.println("json: "+json);
	    System.out.println("json creato");
	    response.setContentType("application/json");
	    response.setCharacterEncoding("UTF-8");
	    response.getWriter().write(json);
	    System.out.println("json inviato");*/
	    temp.setNumattualeprenotati(temp.getNummaxprenotati()-temp.getNumattualeprenotati());
	    session.setAttribute("Evento", temp);
	}
	
}
