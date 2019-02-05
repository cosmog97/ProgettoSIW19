package persistance;
import java.util.List;
import model.Evento;



public interface EventoDAO {
	
	public void save(Evento evento);
	public Evento findByPrimaryKey(String id);
	public List<Evento> findAll();
	public void update(Evento evento);
	public void delete(Evento evento);
	
}
