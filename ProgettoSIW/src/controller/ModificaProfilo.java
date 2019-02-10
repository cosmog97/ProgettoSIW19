package controller;

import java.io.IOException;

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
		String nome = (String)request.getParameter("Nome");
		String cognome = (String)request.getParameter("Cognome");
		
		HttpSession session = request.getSession();
		
		String usernameCorrente = (String)session.getAttribute("Username");
		String nomeCorrente = (String)session.getAttribute("Nome");
		String cognomenomeCorrente = (String)session.getAttribute("Cognome");
		
		System.out.println("usernamecorrente "+usernameCorrente+" "+"nomecorrente "+nomeCorrente+" "+"cognomecorrente "+cognomenomeCorrente);
		
		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(usernameCorrente);
		
		if(temp!=null) {
			
			temp.setNome(nome);
			temp.setCognome(cognome);
			t.modifica(temp);
			
			/*attribuire a sessione valori*/
			session.setAttribute("Username",usernameCorrente);
			session.setAttribute("Nome",temp.getNome());
			session.setAttribute("Cognome",temp.getCognome());
			
			
			
			
			
			RequestDispatcher rd = request.getRequestDispatcher("dashboard.jsp");
			rd.forward(request, response);
		}
		
		
		
		
	}

}
