package model;

public class Partecipazione {
	String nomeutente = "";
	int idevento = 0;
	int postidisponibili = 0;
	
	public Partecipazione() {
		
	}
	
	public Partecipazione(String n, int i, int p) {
		this.nomeutente = n;
		this.idevento = i;
		this.postidisponibili = p;
	}
	
	void setNomeutente (String n) {
		this.nomeutente = n;
	}
	
	String getNomeutente () {
		return nomeutente;
	}
	
	void setIdEvento (int i) {
		this.idevento = i;
	}
	
	int getIdEvento () {
		return idevento;
	}
	
	void setPostiDisponibili (int p) {
		this.postidisponibili = p;
	}
	
	int getPostiDisponibili () {
		return postidisponibili;
	}
}
