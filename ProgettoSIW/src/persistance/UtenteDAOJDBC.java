package persistance;


import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
				String temp ="INSERT INTO gestioneeventidb.\"Utente\"(\"Username\", \"Password\", \"Cognome\", \"Nome\", \"Datanascita\", \"Email\", \"NumeroTelefono\", \"UltimaModPSW\", \"Citta\", \"Provincia\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
				PreparedStatement  statement = connection.prepareStatement(temp);
				
				statement.setString(1,utente.getUsername());
				statement.setString(2,utente.getPassword());
				statement.setString(3,utente.getCognome());
				statement.setString(4,utente.getNome());
				statement.setDate(5,utente.getDatanascita());
				statement.setString(6,utente.getEmail());
				statement.setString(7, utente.getNumerotelefono());
				statement.setDate(8, utente.getUltimamodpsw());
				statement.setString(10,utente.getProvincia());
				statement.setString(9,utente.getCitta());
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
		System.out.println("nomeutentedatrovare "+nomeutente);
		List<Utente> temp = findAll();
		for (Utente i : temp) {
			if (i.getUsername().equals( nomeutente)) {
				System.out.println("Trovato: " + i.getUsername());
				return i;
			}
		}
		return new Utente();
	}

	@Override
	public List<Utente> findAll() {
		Connection connection = this.dataSource.getConnection();
		List<Utente> temp = new ArrayList<Utente>();
		try {
			Class.forName("org.postgresql.Driver");
			
			String select = "SELECT \"Username\", \"Password\", \"Cognome\", \"Nome\", \"Datanascita\", \"Email\", \"NumeroTelefono\", \"UltimaModPSW\", \"Citta\", \"Provincia\" FROM gestioneeventidb.\"Utente\";";
			
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
	             utente.setProvincia (rs.getString(10));
	             utente.setCitta (rs.getString(9));
	             temp.add(utente);
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
	public void update(Utente utente) {
	
		Connection connection = this.dataSource.getConnection();		
		try {
				Class.forName("org.postgresql.Driver");

				String update = "UPDATE gestioneeventidb.\"Utente\" SET \"Cognome\"='"+utente.getCognome()+"', \"Nome\"='"+utente.getNome()+"', \"Datanascita\"='"+utente.getDatanascita()+"', \"Email\"='"+utente.getEmail()+"', \"NumeroTelefono\"='"+utente.getNumerotelefono()+"', \"Citta\"='"+utente.getCitta()+"', \"Provincia\"='"+utente.getProvincia()+"' WHERE \"Username\"='"+utente.getUsername()+"';";
				System.out.println(update);
				Statement statement = connection.createStatement();

				statement.executeUpdate(update);
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
		

	}

	@Override
	public void delete(Utente utente) {
		// TODO Auto-generated method stub

	}

	@Override
	public void setPassword(String nomeutente, String password, Date data) {
		Connection connection = this.dataSource.getConnection();		
		try {
				Class.forName("org.postgresql.Driver");
	
				String update = "UPDATE gestioneeventidb.\"Utente\" SET \"Password\"='"+password+"', \"UltimaModPSW\"='"+data+"' WHERE \"Username\"='"+nomeutente+"';";
				System.out.println(update);
				Statement statement = connection.createStatement();

				statement.executeUpdate(update);
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
		

	}

	@Override
	public int sizeUtenti() {
		
		Connection connection = this.dataSource.getConnection();		
		try {
				Class.forName("org.postgresql.Driver");
				String select = "SELECT count(*) FROM gestioneeventidb.\"Utente\";";
				PreparedStatement statement = connection.prepareStatement(select);

				ResultSet rs = statement.executeQuery();
				
	            while ( rs.next() ) {
	                 return rs.getInt(1);
	            }
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
		return 0;
		
	}
}
		
