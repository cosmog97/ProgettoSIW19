package model;

public class Partecipazione {
	String nomeutente = "";
	int idevento = 0;
	int postiprenotati = 0;
	
	public Partecipazione() {
		
	}
	
	public Partecipazione(String n, int i, int p) {
		this.nomeutente = n;
		this.idevento = i;
		this.postiprenotati = p;
	}
	
	public void setNomeutente (String n) {
		this.nomeutente = n;
	}
	
	public String getNomeutente () {
		return nomeutente;
	}
	
	public void setIdEvento (int i) {
		this.idevento = i;
	}
	
	public int getIdEvento () {
		return idevento;
	}
	
	public void setPostiPrenotati (int p) {
		this.postiprenotati = p;
	}
	
	public int getPostiPrenotati () {
		return postiprenotati;
	}
}
