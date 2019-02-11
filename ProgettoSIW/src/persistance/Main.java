package persistance;

import java.util.List;

import model.Evento;
import model.Utente;

public class Main {

	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		UtenteDAO test = new UtenteDAOJDBC(dataSource);
		Utente c = test.findByPrimaryKey("cosmog97");
		c.setNome("Achiropita");
		c.setCognome("Martilotti");
		test.modifica(c);
		Utente c2 = test.findByPrimaryKey("cosmog97");
		System.out.println("test: " + c2.getNome() + " " + c2.getCognome() );
	}

}
