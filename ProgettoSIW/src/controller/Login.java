package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;
import persistance.*;
import utility.PasswordManager;

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
		String username = (String) request.getSession().getAttribute("Username");
		String password = "";
	
		password = request.getParameter("Password");

		if (username == null) {
			UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
			Utente temp = t.findByPrimaryKey(request.getParameter("Username"));
			//if (temp != null && temp.getPassword().equals(password)) {
				//System.out.println("OK");
				HttpSession session = request.getSession();
				System.out.println(request.getParameter("Password"));
				session.setAttribute("Username", request.getParameter("Username"));
			//}
		}
		else {
			System.out.println("GIA LOGGATO");
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request, response);
	}

}
