package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import utility.PasswordManager;
import model.Utente;
import persistance.DatabaseManager;
import persistance.UtenteDAO;
import persistance.UtenteDAOJDBC;

/**
 * Servlet implementation class Registra
 */
@WebServlet("/Register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
	   	     Utente utente = new Utente();
	   	     utente.setUsername(request.getParameter("Username"));
	   	     //utente.setPassword(PasswordManager.getPasswordCrypto(request.getParameter("Password")));
	   	     utente.setPassword(request.getParameter("Password"));
	   	     utente.setCognome(request.getParameter("Cognome"));
	   	     utente.setNome(request.getParameter("Nome"));
	   	     Date dataNascitaStr = java.sql.Date.valueOf(request.getParameter("Datanascita"));
	    	 utente.setDatanascita(dataNascitaStr);
	   	     utente.setEmail(request.getParameter("Email"));
	   	     utente.setNumerotelefono(request.getParameter("Numerotelefono"));
	   	     utente.setUltimamodpsw(new Date(System.currentTimeMillis()));
	   	     UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
			 t.save(utente);
			RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			rd.forward(request, response);

	   	       
	}

}
