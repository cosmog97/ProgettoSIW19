package persistance;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
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
		try {
				String temp ="INSERT INTO gestioneeventidb.\"Evento\"(\"NomeEvento\", \"CategoriaEvento\", \"NumAttPrenotati\", \"NumMaxPrenotati\", \"InizioEvento\", \"FineEvento\", \"CreazioneEvento\", \"ScadenzaEvento\", \"CreatoreEvento\", \"Provincia\", \"Citta\") VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
				PreparedStatement  statement = connection.prepareStatement(temp);
				
				statement.setString(1,evento.getNome());
				statement.setString(2,evento.getCategoria());
				statement.setInt(3,1);
				statement.setInt(4,evento.getNummaxprenotati());
				statement.setTimestamp(5,evento.getInizio());
				statement.setTimestamp(6,evento.getFine());
				statement.setTimestamp(7,evento.getCreazione());
				statement.setTimestamp(8,evento.getScadenza());
				statement.setString(9,evento.getCreatore());
				statement.setString(10, evento.getProvincia());
				statement.setString(11,evento.getCitta());
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
	public Evento findByPrimaryKey(String id) {
		List<Evento> temp = findAll();
		for (Evento i : temp) {
			if (String.valueOf(i.getId()).equals(id)) {
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
	       	     evento.setProvincia(rs.getString(11));
	       	     evento.setCitta(rs.getString(12));
	       	     
	                
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
	public List<Evento> findAllwithDate(Timestamp date) {
		Connection connection = this.dataSource.getConnection();
		List<Evento> temp = new ArrayList<Evento>();
		try {
			Class.forName("org.postgresql.Driver");

			String select = "SELECT * FROM gestioneeventidb.\"Evento\" WHERE  \"NumAttPrenotati\" < \"NumMaxPrenotati\" and \"ScadenzaEvento\" > '"+date+"' ORDER BY \"InizioEvento\" ASC;";;
			
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
	       	     evento.setProvincia(rs.getString(11));
	       	     evento.setCitta(rs.getString(12));
	       	     
	                
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
	public List<Evento> findAllByCreator (String utente) {
		Connection connection = this.dataSource.getConnection();
		List<Evento> temp = new ArrayList<Evento>();
		try {
			Class.forName("org.postgresql.Driver");

			String select = "SELECT * FROM gestioneeventidb.\"Evento\" WHERE \"CreatoreEvento\"='"+utente+"' ORDER BY \"InizioEvento\" ASC;";
			
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
	       	     evento.setProvincia(rs.getString(11));
	       	     evento.setCitta(rs.getString(12));
	       	     
	                
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
	public List<Evento> findAllByDifferentCreator (String utente, Timestamp date) {
			Connection connection = this.dataSource.getConnection();
			List<Evento> temp = new ArrayList<Evento>();
			try {
				Class.forName("org.postgresql.Driver");

				String select = "SELECT * FROM gestioneeventidb.\"Evento\" WHERE \"CreatoreEvento\"!='"+utente+"' and \"NumAttPrenotati\" < \"NumMaxPrenotati\" and \"ScadenzaEvento\" > '"+date+"' ORDER BY \"InizioEvento\" ASC;";
				
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
		       	     evento.setProvincia(rs.getString(11));
		       	     evento.setCitta(rs.getString(12));
		       	     
		                
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
	public void update(Evento e) {
		Connection connection = this.dataSource.getConnection();		
		try {
				Class.forName("org.postgresql.Driver");

				String update = "UPDATE gestioneeventidb.\"Evento\" SET \"NomeEvento\"='"+e.getNome()+"', \"CategoriaEvento\"='"+e.getCategoria()+"', \"NumAttPrenotati\"='"+e.getNumattualeprenotati()+"', \"NumMaxPrenotati\"='"+e.getNummaxprenotati()+"', \"InizioEvento\"='"+e.getInizio()+"', \"FineEvento\"='"+e.getFine()+"', \"CreazioneEvento\"='"+e.getCreazione()+"', \"ScadenzaEvento\"='"+e.getScadenza()+"', \"CreatoreEvento\"='"+e.getCreatore()+"', \"Provincia\"='"+e.getProvincia()+"', \"Citta\"='"+e.getProvincia()+"' WHERE \"IDEvento\"='"+e.getId()+"';";
				Statement statement = connection.createStatement();

				statement.executeUpdate(update);
			}
		catch (SQLException e1) {
				e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
		}
		finally {
				try {
					connection.close();
				} 
				catch (SQLException e1) {
						e1.printStackTrace();
				}
			}
		

	}

	@Override
	public void delete(int idevento) {
		Connection connection = this.dataSource.getConnection();
		try {
			Class.forName("org.postgresql.Driver");

			String delete = "DELETE FROM gestioneeventidb.\"Evento\" WHERE \"IDEvento\"='"+idevento+"';";
			Statement statement = connection.createStatement();

			statement.executeUpdate(delete);
			
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
	public int findIdByElements(Evento e) {
		Connection connection = this.dataSource.getConnection();

		try {
			Class.forName("org.postgresql.Driver");
			
			String nomeevento = e.getNome();
			String creatore = e.getCreatore();
			String categoria = e.getCategoria();
			String citta = e.getCitta();
			String provincia = e.getProvincia();
			Timestamp creazione = e.getCreazione();
			int nummax = e.getNummaxprenotati();
			int numatt = e.getNumattualeprenotati();
			
			
			String select = "SELECT \"IDEvento\" FROM gestioneeventidb.\"Evento\" WHERE \"NomeEvento\"='"+nomeevento+"' and \"CategoriaEvento\"='"+categoria+"'and \"NumAttPrenotati\"='"+numatt+"' and \"NumMaxPrenotati\"='"+nummax+"' and \"CreazioneEvento\"='"+creazione+"' and \"CreatoreEvento\"='"+creatore+"'and \"Provincia\"='"+provincia+"' and \"Citta\"='"+citta+"';";
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
			while(rs.next()) {
			       return rs.getInt(1);
			}
     
            

		}
		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			
			try {
				connection.close();
			} 
			
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return -1;

	}


	@Override
	public int sizeEventi() {
		Connection connection = this.dataSource.getConnection();

		try {
			Class.forName("org.postgresql.Driver");
		
			
			
			String select = "SELECT count(*) FROM gestioneeventidb.\"Evento\";";
			
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
            	return rs.getInt(1);
            }
            

		}
		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			
			try {
				connection.close();
			} 
			
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}


	@Override
	public int sizeByCategoria(String categoria) {
		Connection connection = this.dataSource.getConnection();

		try {
			Class.forName("org.postgresql.Driver");
		
			
			
			String select = "SELECT count(*) FROM gestioneeventidb.\"Evento\" WHERE \"CategoriaEvento\"='"+categoria+"';";
			
			PreparedStatement statement = connection.prepareStatement(select);

			ResultSet rs = statement.executeQuery();
			
            while ( rs.next() ) {
            	return rs.getInt(1);
            }
            

		}
		catch (SQLException e1) {
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		finally {
			
			try {
				connection.close();
			} 
			
			catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		return 0;
	}

	
}
