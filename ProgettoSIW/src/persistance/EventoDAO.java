package persistance;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.List;
import model.Evento;



public interface EventoDAO {
	
	public void save(Evento evento);
	public Evento findByPrimaryKey(String id);
	public List<Evento> findAll();
	public void update(Evento evento);
	public void delete(Evento evento);
	List<Evento> findAllByDifferentCreator(String utente, Timestamp date);
	List<Evento> findAllwithDate(Timestamp date);
	
}
