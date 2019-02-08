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

import model.Utente;
import persistance.*;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Impossibile effettuare una richiesta doGet sul login.");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String) request.getParameter("Username");
		String password = (String) request.getParameter("Password");

		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(username);
	
		if (temp != null && temp.getUsername().equals(username)) {
			if(password.equals(temp.getPassword())) {
			
				//cookie
				Cookie utente = new Cookie ("Username", "username");
				utente.setMaxAge(60*60*60);
				utente.setPath("/");
				utente.setMaxAge(60*60);
				utente.setSecure(false);
				response.addCookie(utente);
				
				//session
				HttpSession session = request.getSession();
				session.setAttribute("Username", username);
				session.setAttribute("Nome",temp.getNome());
				session.setAttribute("Cognome",temp.getCognome());
				RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
				rd.forward(request, response);

			}
			else {
				System.out.println("Password o email errata");
				RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
				rd.forward(request, response);
			}
		}
		else {
			System.out.println("Nome utente non trovato");
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

		}

	}
}