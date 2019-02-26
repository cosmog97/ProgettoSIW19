package utility;
/*import for email*/

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import model.Evento;
import model.Utente;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import java.util.Properties;


/*fine import for email*/
public class EmailManager {
	
	
    
    public EmailManager() {
		super();
		
	}
    
    public void registerValidationEmail(Utente utente,String to) {
    	String from ="ebookersiw@gmail.com";
    	String message = "Benvenuto, "+utente.getCognome()+" "+utente.getNome()+" su EBOOKER.\n"
    			+ "Ecco un riepilogo dei tuoi dati di registrazione:\n"+
    			"Username: " + utente.getUsername() +"\n"+
    			"Nome: " + utente.getNome() +"\n"+
    			"Cognome: " + utente.getCognome() + "\n" +
    			"Email: " + utente.getEmail() + "\n" +
    			"Data di nascita: " + utente.getDatanascita().toString() +"\n" +
    			"Numero di telefono: " + utente.getNumerotelefono() + "\n"+
    			"Provincia: " + utente.getProvincia() + "\n" +
    			"Citta': " + utente.getCitta() +"\n"+
    			"Trovare nuove amicizie e visitare nuovi posti è più facile! Organize Yourself!";
    	String subject = "Benvenuto su EBOOKER";
    	
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
        	System.out.println("Email errata");
        } catch (MessagingException ex) {
        	System.out.println("Email non inviata");
            
        }
    }//fine funzione
    
    public void creationValidationEmail(Evento e,String to) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+e.getCreatore()+", l'evento e' stato creato con successo. Ecco un breve riepilogo:\n";
    	String temp = "Nome evento: " + e.getNome() + "\n" +
    				"Categoria: " + e.getCategoria() + "\n" +
    				"Data inizio: " + e.getInizio().toString() + "\n" +
    				"Data fine: " + e.getFine().toString() + "\n" +
    				"Data creazione: " + e.getCreazione().toString() + "\n" +
    				"Data scadenza: " + e.getScadenza().toString()+ "\n" +
    				"Posti max: " + e.getNummaxprenotati() + "\n" +
    				"Provincia: " + e.getProvincia() + "\n"+
    				"Citta': " + e.getCitta() + "\n";
    	
    	
    	String stringa1 = "Puo' trovare l'evento nella sezione 'I miei eventi'\n";

    	String completa = message1+temp+stringa1;
    	String subject = "Evento creato con successo";
    	
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
		        	System.out.println("Email errata ");
		        } catch (MessagingException ex) {
		        	System.out.println("Email non inviata");
		        }
    }//fine funzione

    public void passwordChangedEmail(String nomeUtente,String to,String passwordNuova) {
    	
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+nomeUtente+", la password del profilo e' stata cambiata con successo.\n";
    	String finale2 = "Distinti saluti, staff EBOOKER\n";
    	String completa = message1+finale2;
    	String subject = "Password cambiata con successo";
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
        	System.out.println("Email errata");
        } catch (MessagingException ex) {
        	System.out.println("Email non inviata");
            
        }
    }//fine funzione
	
    public void partecipazioneEmail(String nomeUtente,String to, Evento e, int posti) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+", la prenotazione al seguente evento e' avvenuta con successo.\n";
    	String stringa1 = "Nome evento: "+e.getNome()+"\n";
    	String stringa2 = "Categoria: "+e.getCategoria()+"\n";
    	String stringa3 = "Data inizio: "+e.getInizio().toString()+"\n";
    	String stringa4 = "Data fine: "+e.getFine().toString()+"\n";
    	String stringa6 = "Provincia: "+e.getProvincia()+"\n";
    	String stringa7 = "Citta': "+e.getCitta()+"\n";
    	String stringa5 = "Numero di posti prenotati: "+posti+"\n";
    	
    	String finale2 = "Distinti saluti, staff EBOOKER\n";
    	String completa = message1+stringa1+stringa2+stringa3+stringa4+stringa6+stringa7+stringa5+finale2;
    	String subject = "Evento prenotato con successo";
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
        	System.out.println("Email errata");
        } catch (MessagingException ex) {
        	System.out.println("Email non inviata");
            
        }
    }//fine funzione
    
    public void profilomodificatoEmail(String nomeUtente,String to,String nome,String cognome,String email, Date data,String provincia,String citta) {
    	String from ="ebookersiw@gmail.com";
    	String message1 = "Salve "+" "+nomeUtente+" la informiamo che il suo profilo e' stato modificato con successo.\n";
    	String message2 = "Nome: "+nome+"\n";
    	String message3 = "Cognome: "+cognome+"\n";
    	String message4 = "Email: "+email+"\n";
    	String message5 = "Data di Nascita: "+data+"\n";
    	String message6 = "Provincia: "+provincia+"\n";
    	String message7 = "Citta': "+citta+"\n";
    
    	String finale2 = "Distinti saluti, staff EBOOKER.\n";
    	String completa = message1+message2+message3+message4+message5+message6+message7+finale2;
    	String subject = "Cambio dati profilo avvenuto con successo";
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
	        	System.out.println("Email errata");
	        } catch (MessagingException ex) {
	        	System.out.println("Email non inviata");
	            
	        }
	    	
	    }//fine funzione
    	
    
    	public void eventoeliminatoEmail(Evento e,List<String> to) {
    		String from ="ebookersiw@gmail.com";
    		String message = "Salve, volevamo informarla che l' evento "+e.getNome()+" di "+e.getCreatore()+" per il giorno "+e.getInizio()+" a cui eri prenotato è stato eliminato\n";
    		String message2 = "Cerca un evento simile nella sezione dedicata.\n";
        	String finale2 = "Distinti saluti, staff EBOOKER.\n";
        	String completa = message+message2+finale2;
        	String subject = "Evento eliminato";
        	
        	
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
	            for (int i = 0; i < to.size(); i++) {
	    			msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to.get(i)));
	            }
	            
	            
	            Transport transport = mailsession.getTransport("smtp");
	            transport.connect("smtp.gmail.com", "ebookersiw@gmail.com", "prenotato.13");
	            transport.sendMessage(msg,msg.getAllRecipients());
	            transport.close();
	            
	        }catch (AddressException ex) {
	        	System.out.println("Email errata");
	        } catch (MessagingException ex) {
	        	System.out.println("Email non inviata");
	            
	        }
        	
    	
    	}//fine funzione
    	
    	public void tuoeventoeliminato(Evento e,String to) {
    		String from ="ebookersiw@gmail.com";
    		String message = "Salve "+e.getCreatore()+", l'evento "+e.getNome()+" creato il "+e.getCreazione()+" e' stato eliminato. Gli utenti prenotati riceveranno una notifica per l'eliminazione.\n";
    		String finale = "Per disguidi o errori può trovare i recapiti dello staff di EBOOKER nella sezione Contatti.\n";
        	String finale2 = "Distinti saluti, staff EBOOKER.\n";
        	String completa = message+finale+finale2;
        	String subject = "Evento eliminato";
        	
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
	        	System.out.println("Email errata");
	        } catch (MessagingException ex) {
	        	System.out.println("Email non inviata");
	            
	        }
    		
    	}//fine funzione
    	
    	
    	
    	
}//fine classe
