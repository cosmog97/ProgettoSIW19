package utility;
/*import for email*/

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Properties;


/*fine import for email*/
public class EmailManager {
	
	
    
    public EmailManager() {
		super();
		
	}
    
    public void registerValidationEmail(String nomeUtente,String to) {
    	String from ="ebookersiw@gmail.com";
    	String message = "Benvenuto, "+nomeUtente+" ora puoi creare e cercare gli eventi che preferisci. Enjoy Yourself :)";
    	String subject = "Benvenuto su ebooker";
    	//riepilogo dati?
    	try {
		 	
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
            
            Transport transport = mailsession.getTransport("smtp");
            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            
        }catch (AddressException ex) {
        	System.out.println("email errata");
        } catch (MessagingException ex) {
        	System.out.println("email non inviata");
            
        }
    }//fine funzione
    
    public void creationValidationEmail(String nomeUtente,String to) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+" la informiamo che la sua creazione dell'evento e' andata a buon fine\n";
    	String stringa1 = "Puo' trovare il suo evento creato su 'I miei eventi'\n";
    	String finale = "Lo staff sempre a disposizione\n";
    	String finale2 = "Distinti saluti, staff ebooker\n";
    	String completa = message1+stringa1+finale+finale2;
    	String subject = "Evento creato con successo.";
    	
		try {
				 	
		            Properties props = new Properties();
		            props.setProperty("mail.smtp.host", "smtp.gmail.com");
		            props.setProperty("mail.smtp.port", "587");
		            props.setProperty("mail.smtp.auth", "true");
		            props.setProperty("mail.smtp.starttls.enable", "true");
		            props.setProperty("mail.transport.protocol","smtp");
		            
		            Session mailsession = Session.getInstance(props,null);
		 
		            MimeMessage msg = new MimeMessage(mailsession);
		            msg.setText(completa);
		            msg.setSubject(subject);
		            msg.setFrom(new InternetAddress(from));
		            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
		            
		            Transport transport = mailsession.getTransport("smtp");
		            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
		            transport.sendMessage(msg,msg.getAllRecipients());
		            transport.close();
		            
		        }catch (AddressException ex) {
		        	System.out.println("email sssserratas");
		        } catch (MessagingException ex) {
		        	System.out.println("email non inviata");
		        }
    }//fine funzione

    public void passwordChangedEmail(String nomeUtente,String to,String passwordNuova) {
    	
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+" la informiamo che la sua password e' stata cambiata con successo in\n";
    	String message2 = "Nuova Password: "+passwordNuova+"\n";
    	String finale = "Lo staff sempre a disposizione\n";
    	String finale2 = "Distinti saluti, staff ebooker\n";
    	String completa = message1+message2+finale+finale2;
    	String subject = "Password cambiata con successo.";
    	try {
		 	
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.transport.protocol","smtp");
            
            Session mailsession = Session.getInstance(props,null);
 
            MimeMessage msg = new MimeMessage(mailsession);
            msg.setText(completa);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            Transport transport = mailsession.getTransport("smtp");
            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            
        }catch (AddressException ex) {
        	System.out.println("email errata");
        } catch (MessagingException ex) {
        	System.out.println("email non inviata");
            
        }
    }//fine funzione
	
    public void partecipazioneEmail(String nomeUtente,String to,String creatore,String luogo, Timestamp datainizio) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+" la informiamo che la sua prenotazione per l evento:\n";
    	String stringa1 = "Di: "+creatore+"\n";
    	String stringa2 = "Presso: "+luogo+"\n";
    	String stringa3 = "In data: "+datainizio+"\n";
    	String stringa4 = "E' avvenuta con successo\n";
    	String finale = "Lo staff sempre a disposizione\n";
    	String finale2 = "Distinti saluti, staff ebooker\n";
    	String completa = message1+stringa1+stringa2+stringa3+stringa4+finale+finale2;
    	String subject = "Evento prenotato con successo.";
    	try {
		 	
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.transport.protocol","smtp");
            
            Session mailsession = Session.getInstance(props,null);
 
            MimeMessage msg = new MimeMessage(mailsession);
            msg.setText(completa);
            msg.setSubject(subject);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            
            Transport transport = mailsession.getTransport("smtp");
            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
            transport.sendMessage(msg,msg.getAllRecipients());
            transport.close();
            
        }catch (AddressException ex) {
        	System.out.println("email errata");
        } catch (MessagingException ex) {
        	System.out.println("email non inviata");
            
        }
    }//fine funzione
    
    public void profilomodificatoEmail(String nomeUtente,String to,String nome,String cognome,String email, Date data,String provincia,String citta) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+" la informiamo che il suo profilo e' stato modificato:\n";
    	String message2 = "Nome: "+nome+"\n";
    	String message3 = "Cognome: "+cognome+"\n";
    	String message4 = "Email: "+email+"\n";
    	String message5 = "Data di Nascita: "+data+"\n";
    	String message6 = "Data di Nascita: "+provincia+"\n";
    	String message7 = "Data di Nascita: "+citta+"\n";
    	String finale = "Lo staff sempre a disposizione.\n";
    	String finale2 = "Distinti saluti, staff ebooker.\n";
    	String completa = message1+message2+message3+message4+message5+message6+message7+finale+finale2;
    	String subject = "Cambio dati profilo avvenuto con successo.";
    	try {
			 	System.out.println("bomba1"); //eliminareeeeeee
	            Properties props = new Properties();
	            props.setProperty("mail.smtp.host", "smtp.gmail.com");
	            props.setProperty("mail.smtp.port", "587");
	            props.setProperty("mail.smtp.auth", "true");
	            props.setProperty("mail.smtp.starttls.enable", "true");
	            props.setProperty("mail.transport.protocol","smtp");
	            
	            Session mailsession = Session.getInstance(props,null);
	 
	            MimeMessage msg = new MimeMessage(mailsession);
	            msg.setText(completa);
	            msg.setSubject(subject);
	            msg.setFrom(new InternetAddress(from));
	            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
	            
	            Transport transport = mailsession.getTransport("smtp");
	            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
	            transport.sendMessage(msg,msg.getAllRecipients());
	            transport.close();
	            
	        }catch (AddressException ex) {
	        	System.out.println("email errata");
	        } catch (MessagingException ex) {
	        	System.out.println("email non inviata");
	            
	        }
	    	
	    }//fine funzione
    	
    	
    	
    	
    	
}//fine classe
