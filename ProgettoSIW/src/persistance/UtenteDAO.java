package persistance;

import java.sql.Date;
import java.util.List;

import model.Utente;


public interface UtenteDAO {
	
	public void save(Utente utente);
	public Utente findByPrimaryKey(String nomeutente);
	public List<Utente> findAll();
	public void update(Utente utente);
	public void delete(Utente utente);
	public void setPassword(String nomeutente, String password, Date date);
}
