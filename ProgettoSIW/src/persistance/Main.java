package persistance;

import java.util.List;

import model.Evento;
import model.Utente;

public class Main {

	public static void main(String[] args) {
		DataSource dataSource = new DataSource();
		UtenteDAO test = new UtenteDAOJDBC(dataSource);
		List<Utente> c = test.findAll();
		for (Utente i : c) {
			System.out.println(i.getUsername());
		}
	}

}
