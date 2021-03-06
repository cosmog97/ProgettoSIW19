package controller;

import java.io.IOException;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

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
		Date dataNascitaCorrente = (Date) session.getAttribute("Datanascita");
		String provinciaCorrente = (String)session.getAttribute("Provincia");
		String cittaCorrente = (String)session.getAttribute("Citta");
		
		String nome = (String) request.getParameter("Nome");
		String cognome = (String) request.getParameter("Cognome");
		String email = (String) request.getParameter("Email");
		String datanascitaStr = (String) request.getParameter("Datanascita");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		java.util.Date date = null;
		try {
			date = sdf.parse(datanascitaStr);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			
		}
		java.sql.Date sqlDate = null;
		if (date != null) {
			sqlDate = new Date(date.getTime());
		}

		String provincia = (String) request.getParameter("Provincia");
		String citta = (String) request.getParameter("Citta");
		
		UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();
		Utente temp = t.findByPrimaryKey(usernameCorrente);
		
		if(temp!=null) {
			if((nome != null && nome != "") && !nome.equals(nomeCorrente)) {
				temp.setNome(nome);
			}
			if((cognome !=null && cognome != "") && !cognome.equals(cognomeCorrente)) {
				temp.setCognome(cognome);
			}
			if((email != null && !email.equals("")) && !email.equals(emailCorrente) ) {  //aggiungere a tutti
				temp.setEmail(email);	
			}
			if (sqlDate != null) {
				temp.setDatanascita(sqlDate);
			}
			if((provincia != null && provincia != "") && !provincia.equals(provinciaCorrente)) {
				temp.setProvincia(provincia);
			}
			if((citta != null && citta != "") && !citta.equals(cittaCorrente)) {
				temp.setCitta(citta);
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
			
			EmailManager em = new EmailManager();
		    em.profilomodificatoEmail(usernameCorrente,temp2.getEmail(),temp2.getNome(),temp2.getCognome(),temp2.getEmail(),temp2.getDatanascita(),temp2.getProvincia(),temp2.getCitta());;
			
			
			RequestDispatcher rd = request.getRequestDispatcher("modificaprofilo.jsp");
			rd.forward(request, response);
		}
	}
}
