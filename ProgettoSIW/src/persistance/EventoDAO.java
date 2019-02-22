package persistance;

import java.sql.Timestamp;
import java.util.List;
import model.Evento;



public interface EventoDAO {
	
	public void save(Evento evento);
	public Evento findByPrimaryKey(String id);
	public int findIdByElements(Evento e);	
	public List<Evento> findAll();
	public void update(Evento evento);
	public void delete(int idevento);
	public List<Evento> findAllByDifferentCreator(String utente, Timestamp date);
	public List<Evento> findAllwithDate(Timestamp date);
	public List<Evento> findAllByCreator(String utente);
	public int sizeEventi();
	public int sizeByCategoria(String categoria);
	
}
