package persistance;

import java.sql.*;



class DataSource {
	final private String dbURI = "jdbc:postgresql://gestioneeventi.cbbekpkdhfhq.eu-central-1.rds.amazonaws.com/GestioneEventi";
	final private String userName = "gestioneeventiadmin";
	final private String password = "Memoplus21.";
	

	public Connection getConnection() {
		Connection connection = null;
		try {
			connection = DriverManager.getConnection(dbURI,userName, password);
		
		} catch(SQLException e) {
			
		}
		return connection;
	}
}
