package controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Utente;
import persistance.DatabaseManager;
import persistance.UtenteDAO;

/**
 * Servlet implementation class ModificaPassword
 */
@WebServlet("/ModificaPassword")
public class ModificaPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaPassword() {
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
		String usernameCorrente = (String)session.getAttribute("Username");
		String vecchiaPassword = (String) request.getParameter("Vecchiapassword");
		String nuovaPassword = (String) request.getParameter("Nuovapassword");
		String ripetiNuovaPassword = (String) request.getParameter("Ripetinuovapassword");
		Date data = new Date(System.currentTimeMillis());
		
		System.out.println("User :" + usernameCorrente);
		System.out.println("Vecchia psw: " + vecchiaPassword);
		System.out.println("Nuova psw: " + nuovaPassword);
		System.out.println("Ripeti psw: "+ripetiNuovaPassword);
		
		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(usernameCorrente);
		String passwordDB = temp.getPassword();
		if (passwordDB.equals(vecchiaPassword) && nuovaPassword.equals(ripetiNuovaPassword)) {
			System.out.println("Modifica password ok");
			t.setPassword(usernameCorrente, nuovaPassword, data);
			session.setAttribute("Ultimamodpassword",data);
		}
		RequestDispatcher rd = request.getRequestDispatcher("modificaprofilo.jsp");
		rd.forward(request, response);
	}

}
