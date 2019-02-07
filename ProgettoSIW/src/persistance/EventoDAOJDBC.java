package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Evento;
import model.Utente;

public class EventoDAOJDBC implements EventoDAO {
	private DataSource dataSource;

	public EventoDAOJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	@Override
	public void save(Evento evento) {
		Connection connection = this.dataSource.getConnection();

	}

	@Override
	public Evento findByPrimaryKey(String id) {
		Connection connection = this.dataSource.getConnection();
		List<Evento> temp = findAll();
		for (Evento i : temp) {
			if (String.valueOf(i.getId()) == id) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Evento> findAll() {
		Connection connection = this.dataSource.getConnection();
		List<Evento> temp = new ArrayList<Evento>();
		try {
			Class.forName("org.postgresql.Driver");

			String select = "SELECT * FROM gestioneeventidb.\"Evento\"\r\n" + 
					"ORDER BY \"IDEvento\" ASC ";
			
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
                Evento evento = new Evento();
                
                 evento.setId( Integer.parseInt(rs.getString(1)));
	       	     evento.setNome( rs.getString(2));
	       	     evento.setCategoria ( rs.getString(3));
	       	     evento.setNumattualeprenotati( Integer.parseInt(rs.getString(4)));
	       	     evento.setNummaxprenotati(Integer.parseInt(rs.getString(5)));
	       	     evento.setInizio( rs.getTimestamp(6));
	       	     evento.setFine( rs.getTimestamp(7));
	       	     evento.setCreazione( rs.getTimestamp(8));
	       	     evento.setScadenza( rs.getTimestamp(9));
	       	     evento.setCreatore(rs.getString(10));
	                
                temp.add(evento);
            }
            

            return temp;
			
		}
		catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
			try {
				connection.close();
			} 
			
			catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
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
