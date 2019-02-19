package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*import for email*/
import javax.mail.AuthenticationFailedException;
import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.*;
import java.net.*;

import utility.EmailManager;

/*fine import for email*/

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
  	    UtenteDAO t = DatabaseManager.getInstance().getDaoFactory().getUtenteDAO();	
		if(t.findByPrimaryKey(request.getParameter("Username")) != null) {
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
	   	     utente.setProvincia(request.getParameter("Provincia"));
	   	     utente.setCitta(request.getParameter("Citta"));

			 t.save(utente);
			 
			 /*gestione email di benvenuto*/
			 
<<<<<<< Upstream, based on origin/master
			 String from ="ebookersiw@gmail.com";
		     String to = utente.getEmail();
		     String subject = "Benvenuto su eBooker";
		     String message = "Benvenuto"+utente.getNome()+"sul nostro sito, ora puoi creare e cercare gli eventi a cui vorresti partecipare. Enjoy yourself :)";
		     
		     
			 try {
				 	//java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider);
		            System.out.println("in try");
		            System.out.println(to); //stampa email
				 	Properties props = new Properties();
		            props.setProperty("mail.smtp.host", "smtp.gmail.com");
		            props.setProperty("mail.smtp.port", "587");
		            props.setProperty("mail.smtp.auth", "true");
		            props.setProperty("mail.smtp.starttls.enable", "true");
		            props.setProperty("mail.transport.protocol","smtp");
		            
		            Session mailsession = Session.getInstance(props,null);
		 
		            MimeMessage msg = new MimeMessage(mailsession);
		            msg.setText(message);
		            msg.setSubject(subject);
		            msg.setFrom(new InternetAddress(from));
		            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		            //Transport.send(msg);
		            Transport transport = mailsession.getTransport("smtp");
		            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
		            transport.sendMessage(msg,msg.getAllRecipients());
		            transport.close();
		        }catch (AddressException ex) {
		        	System.out.println("email errata");
		        } catch (MessagingException ex) {
		        	System.out.println("email non inviata");
		            
		        }
			 /*fine gestione email*/
=======
			 EmailManager em = new EmailManager();
			 em.registerValidationEmail(utente.getNome(),utente.getEmail());
>>>>>>> e93fc2e Prova la mail <3 :*
			 RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
			 rd.forward(request, response);
		}
		else {
			RequestDispatcher rd = request.getRequestDispatcher("register.jsp");
			rd.forward(request, response);

		}
	}

}
