package persistance;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Partecipazione;

public class PartecipazioneDAOJDBC implements PartecipazioneDAO {

	private DataSource dataSource;

	public PartecipazioneDAOJDBC (DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public void save(Partecipazione partecipazione) {
		Connection connection = this.dataSource.getConnection();
		try {
				String save ="INSERT INTO gestioneeventidb.\"Partecipazioni\"(\"Username\", \"IDEvento\", \"Posti\") VALUES (?, ?, ?);";
				PreparedStatement  statement = connection.prepareStatement(save);
				
				statement.setString(1, partecipazione.getNomeutente());
				statement.setInt(2, partecipazione.getIdEvento());
				statement.setInt(3, partecipazione.getPostiPrenotati());
				statement.executeUpdate();

		}
		catch (SQLException e) {
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
		
	}

	@Override
	public Partecipazione findByUtenteIdEvento(String utente, int idevento) {
		List<Partecipazione> all = findAll();
		for (Partecipazione i : all) {
			if (i.getNomeutente().equals(utente) && i.getIdEvento() == idevento) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Partecipazione> findAll() {
		Connection connection = this.dataSource.getConnection();
		List<Partecipazione> temp = new ArrayList<Partecipazione>();
		try {
			Class.forName("org.postgresql.Driver");
			
			String select = "SELECT * FROM gestioneeventidb.\"Partecipazioni\";";
			
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
                 Partecipazione p = new Partecipazione();
                 p.setNomeutente( rs.getString(1));
	       	     p.setIdEvento( rs.getInt(2));
	       	     p.setPostiPrenotati( rs.getInt(3));
	       	     temp.add(p);
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
	public void update(Partecipazione partecipazione) {
		String update = "UPDATE gestioneeventidb.\"Partecipazioni\" SET \"Posti\"=''WHERE \"Username\"='', \"IDEvento\"='' ;";
		
	}

	@Override
	public void delete(Partecipazione partecipazione) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Partecipazione> findAllByUtente(String utente) {
		List<Partecipazione> all = findAll();
		List<Partecipazione> sorted = findAll();
		for (Partecipazione i : all) {
			if (i.getNomeutente().equals(utente)) {
				sorted.add(i);
			}
		}
		return sorted;
	}

	@Override
	public List<Partecipazione> findAllByEvento(int idevento) {
		List<Partecipazione> all = findAll();
		List<Partecipazione> sorted = findAll();
		for (Partecipazione i : all) {
			if (i.getIdEvento() == idevento) {
				sorted.add(i);
			}
		}
		return sorted;
	}
	
	@Override
	public void deleteByIdEvento (int idevento) {
		Connection connection = this.dataSource.getConnection();
		try {
			Class.forName("org.postgresql.Driver");
			
			String delete = "DELETE FROM gestioneeventidb.\"Partecipazioni\" WHERE \"IDEvento\"='"+idevento+"';";
			Statement statement = connection.createStatement();

			statement.executeUpdate(delete);

		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
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
	}

	@Override
	public List<String> getEmailByEvento(int idevento) {
		Connection connection = this.dataSource.getConnection();
		List<String> temp = new ArrayList<String>();
		try {
			Class.forName("org.postgresql.Driver");
			
			String select = "SELECT \"Email\" FROM gestioneeventidb.\"Utente\" WHERE \"Username\" IN (SELECT \"Username\" FROM gestioneeventidb.\"Partecipazioni\" WHERE \"IDEvento\"='"+idevento+"');";
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
	       	     temp.add(rs.getString(1));
            }

            return temp;
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		catch (ClassNotFoundException e) {
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
	
}
