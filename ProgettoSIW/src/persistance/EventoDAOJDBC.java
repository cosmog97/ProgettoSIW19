package persistance;

import java.util.List;

import model.Evento;

public class EventoDAOJDBC implements EventoDAO {
	private DataSource dataSource;

	public EventoDAOJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public void save(Evento evento) {
		// TODO Auto-generated method stub

	}

	@Override
	public Evento findByPrimaryKey(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Evento> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void update(Evento evento) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Evento evento) {
		// TODO Auto-generated method stub

	}

}
