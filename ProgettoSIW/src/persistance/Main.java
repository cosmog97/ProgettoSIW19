package persistance;

import java.util.List;

import model.Evento;
import model.Utente;

public class Main {

	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		UtenteDAO test = new UtenteDAOJDBC(dataSource);
		Utente c = test.findByPrimaryKey("cosmog97");

	}

}
