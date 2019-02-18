package persistance;

public class PartecipazioneDAOJDBC implements PartecipazioneDAO {

	private DataSource dataSource;

	public PartecipazioneDAOJDBC (DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
}
