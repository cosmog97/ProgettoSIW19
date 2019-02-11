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
 * Servlet implementation class ModificaProfilo
 */
@WebServlet("/ModificaProfilo")
public class ModificaProfilo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModificaProfilo() {
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
		
		String usernameCorrente = (String)session.getAttribute("Username");
		String nomeCorrente = (String)session.getAttribute("Nome");
		String cognomeCorrente = (String)session.getAttribute("Cognome");
		String emailCorrente = (String) session.getAttribute("Email");
		String dataNascitaCorrente = (String) session.getAttribute("Datanascita");
		String provinciaCorrente = (String)session.getAttribute("Provincia");
		String cittaCorrente = (String)session.getAttribute("Citta");
		
		String nome = (String) request.getParameter("Nome");
		String cognome = (String) request.getParameter("Cognome");
		String email = (String) request.getParameter("Email");
		String datanascita = (String) request.getParameter("Datanascita");
		System.out.println("test" + request.getParameter("Datanascita"));
		
		
		
		
		//System.out.println(request.getParameter("Datanascita"));
		//Date dataNascitaStr = java.sql.Date.valueOf(request.getParameter("Datanascita"));
		String provincia = (String) request.getParameter("Provincia");
		String citta = (String) request.getParameter("Citta");
		
		System.out.println("nomecorrente: "+nomeCorrente+ "" + cognomeCorrente);
		
		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(usernameCorrente);
		
		if(temp!=null) {
			if(nome != null) {
				temp.setNome(nome);
				System.out.println("OK nome");
			}
			if(cognome != null) {
				temp.setCognome(cognome);
				System.out.println("Ok cognome");
			}
			if(email != null) {
				temp.setEmail(email);
				System.out.println("Ok email");
			}
		/*	if (dataNascitaStr != null) {
				temp.setDatanascita(dataNascitaStr);
				System.out.println("OK datanascita");
			}*/
			if(provincia != null) {
				temp.setProvincia(provincia);
				System.out.println("Ok provincia");
			}
			if(citta != null) {
				temp.setCitta(citta);
				System.out.println("Ok citta");
			}
			t.update(temp);
			Utente temp2 = t.findByPrimaryKey(usernameCorrente);
			
			session.setAttribute("Username",usernameCorrente);
			session.setAttribute("Nome",temp2.getNome());
			session.setAttribute("Cognome",temp2.getCognome());
			session.setAttribute("Email",temp2.getEmail());
			session.setAttribute("Datanascita",temp2.getDatanascita());
			session.setAttribute("Provincia",temp2.getProvincia());
			session.setAttribute("Citta",temp2.getCitta());
			
			RequestDispatcher rd = request.getRequestDispatcher("modificaprofilo.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}
