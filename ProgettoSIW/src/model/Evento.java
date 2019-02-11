package model;

import java.sql.Timestamp;

public class Evento {
	int id;
	String nome;
	String categoria;
	String creatore;
	int numattualeprenotati;
	int nummaxprenotati;
	Timestamp inizio;
	Timestamp fine;
	Timestamp creazione;
	Timestamp scadenza;
	String citta;
	String provincia;
	public Evento() {
		
	}
	
	public Evento(int id, String nome, String categoria,int numattualeprenotati,
			int nummaxprenotati, Timestamp inizio, Timestamp fine, Timestamp creazione, Timestamp scadenza,String creatore,String provincia,String citta) {
		this.id = id;
		this.nome = nome;
		this.categoria = categoria;
		this.creatore = creatore;
		this.numattualeprenotati = numattualeprenotati;
		this.nummaxprenotati = nummaxprenotati;
		this.inizio = inizio;
		this.fine = fine;
		this.creazione = creazione;
		this.scadenza = scadenza;
		this.citta = citta;
		this.provincia = provincia;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCreatore() {
		return creatore;
	}
	public void setCreatore(String creatore) {
		this.creatore = creatore;
	}
	public int getNumattualeprenotati() {
		return numattualeprenotati;
	}
	public void setNumattualeprenotati(int numattualeprenotati) {
		this.numattualeprenotati = numattualeprenotati;
	}
	public int getNummaxprenotati() {
		return nummaxprenotati;
	}
	public void setNummaxprenotati(int nummaxprenotati) {
		this.nummaxprenotati = nummaxprenotati;
	}
	public Timestamp getInizio() {
		return inizio;
	}
	public void setInizio(Timestamp inizio) {
		this.inizio = inizio;
	}
	public Timestamp getFine() {
		return fine;
	}
	public void setFine(Timestamp fine) {
		this.fine = fine;
	}
	public Timestamp getCreazione() {
		return creazione;
	}
	public void setCreazione(Timestamp creazione) {
		this.creazione = creazione;
	}
	public Timestamp getScadenza() {
		return scadenza;
	}
	public void setScadenza(Timestamp scadenza) {
		this.scadenza = scadenza;
	}
	public String getProvincia() {
		return provincia;
	}
	
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String getCitta() {
		return citta;
	}
	
	public void setCitta (String citta) {
		this.citta = citta;
	}

	
}
