package persistance;

import java.util.List;

import model.Partecipazione;

public interface PartecipazioneDAO {
	public void save(Partecipazione partecipazione);
	public Partecipazione findByUtenteIdEvento(String utente, int idevento);
	public List<Partecipazione> findAll();
	public void update(Partecipazione partecipazione);
	public void delete(Partecipazione partecipazione);
	public List<Partecipazione> findAllByUtente(String utente);
	public List<Partecipazione> findAllByEvento(int idevento);
	public void deleteByIdEvento(int idevento);
	public List<String> getEmailByEvento(int idevento);
	public List<Partecipazione> findPrenotazioni(String utente);
}
