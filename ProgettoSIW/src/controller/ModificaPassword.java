package controller;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
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
import utility.EmailManager;
import utility.PasswordManager;

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
		String email = (String) session.getAttribute("Email");
		Date data = new Date(System.currentTimeMillis());

		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(usernameCorrente);
		String passwordDB = temp.getPassword();
		if (passwordDB.equals(vecchiaPassword) && nuovaPassword.equals(ripetiNuovaPassword)) {
			String passwordCrypto = "";
			try {
				passwordCrypto = PasswordManager.getPasswordCrypto(nuovaPassword);
			} catch (NoSuchAlgorithmException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			t.setPassword(usernameCorrente, passwordCrypto, data);
			
			EmailManager em = new EmailManager();
			em.passwordChangedEmail(usernameCorrente, email, nuovaPassword);
			
			session.setAttribute("Ultimamodpassword",data);
		}
		RequestDispatcher rd = request.getRequestDispatcher("modificaprofilo.jsp");
		rd.forward(request, response);
	}

}
