package persistance;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Utente;


public class UtenteDAOJDBC implements UtenteDAO {
	private DataSource dataSource;

	public UtenteDAOJDBC(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	@Override
	public void save(Utente utente) {
		Connection connection = this.dataSource.getConnection();
		try {
				String temp = "INSERT INTO gestioneeventidb.\"Utente\"(\r\n" + 
						"	\"Username\", \"Password\", \"Cognome\", \"Nome\", \"Datanascita\", \"Email\", \"NumeroTelefono\", \"UltimaModPSW\")\r\n" + 
						"	VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
				PreparedStatement  statement = connection.prepareStatement(temp);
				
				statement.setString(1,utente.getUsername());
				statement.setString(2,utente.getPassword());
				statement.setString(3,utente.getCognome());
				statement.setString(4,utente.getNome());
				statement.setDate(5,utente.getDatanascita());
				statement.setString(6,utente.getEmail());
				statement.setString(7, utente.getNumerotelefono());
				statement.setDate(8, utente.getUltimamodpsw());
				//statement.setBoolean(8, utente.isValid());
				//mettere la boolean emailvalida

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
	public Utente findByPrimaryKey(String nomeutente) {
		List<Utente> temp = findAll();
		for (Utente i : temp) {
			if (i.getUsername() == nomeutente) {
				return i;
			}
		}
		return null;
	}

	@Override
	public List<Utente> findAll() {
		Connection connection = this.dataSource.getConnection();
		List<Utente> temp = new ArrayList<Utente>();
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("Entro findAll()");
			//String select = QueryManager.readFileAsString("sql/select.txt");
			String select = "SELECT \"Username\", \"Password\", \"Cognome\", \"Nome\", \"Datanascita\", \"Email\", \"NumeroTelefono\", \"UltimaModPSW\"\r\n" + 
					"	FROM gestioneeventidb.\"Utente\";";
			
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
                 Utente utente = new Utente();
                
                 utente.setUsername( rs.getString(1));
	       	     utente.setPassword( rs.getString(2));
	       	     utente.setCognome( rs.getString(3));
	       	     utente.setNome( rs.getString(4));
	       	     utente.setDatanascita(rs.getDate(5));
	       	     utente.setEmail( rs.getString(6));
	       	     utente.setNumerotelefono( rs.getString(7));
	       	     utente.setUltimamodpsw( rs.getDate(8));
	                
                temp.add(utente);
            }
            
            System.out.println("Esco findAll()");
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
		return temp;
	}
	

	@Override
	public void update(Utente utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Utente utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPassword(Utente utente, String password) {
		// TODO Auto-generated method stub

	}

}
