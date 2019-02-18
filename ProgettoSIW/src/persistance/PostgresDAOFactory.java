package persistance;

class PostgresDAOFactory extends DAOFactory {

	private static DataSource dataSource;
	
	static {
		try {
			Class.forName("org.postgresql.Driver");

			dataSource = new DataSource();
		} 
		catch (Exception e) {
			System.err.println("PostgresDAOFactory.class: failed to load MySQL JDBC driver\n"+e);
			e.printStackTrace();
		}
	}

	
	// --------------------------------------------
	
	@Override
	public EventoDAO getEventoDAO() {
		// TODO Auto-generated method stub
		return new EventoDAOJDBC(dataSource);
	}

	@Override
	public UtenteDAO getUtenteDAO() {
		// TODO Auto-generated method stub
		return new UtenteDAOJDBC(dataSource);
	}
	
	@Override
	public PartecipazioneDAO getPartecipazioneDAO() {
		// TODO Auto-generated method stub
		return new PartecipazioneDAOJDBC(dataSource);
	}
	
}
