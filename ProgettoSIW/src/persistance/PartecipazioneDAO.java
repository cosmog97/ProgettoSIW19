package persistance;

import java.util.List;

import model.Partecipazione;

public interface PartecipazioneDAO {
	public void save(Partecipazione partecipazione);
	public Partecipazione findByUtenteIdEvento(String utente, int idevento);
	public List<Partecipazione> findAll();
	public void update(Partecipazione partecipazione);
	public void delete(Partecipazione partecipazione);
	List<Partecipazione> findAllByUtente(String utente);
	List<Partecipazione> findAllByEvento(int idevento);
	void deleteByIdEvento(int idevento);
	List<String> getEmailByEvento(int idevento);

}
