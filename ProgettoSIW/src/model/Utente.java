package model;

import java.sql.Date;

public class Utente {

	String username="";
	String password="";
	String cognome="";
	String nome="";
	Date datanascita=null;
	String email="";
	String numerotelefono="";
	Date ultimamodpsw=null;
	public boolean valid=false;
	
	
	public Utente(String username, String password, String cognome, String nome, Date datanascita, String email,
			String numerotelefono, Date ultimamodpsw, boolean valid) {
		this.username = username;
		this.password = password;
		this.cognome = cognome;
		this.nome = nome;
		this.datanascita = datanascita;
		this.email = email;
		this.numerotelefono = numerotelefono;
		this.ultimamodpsw = ultimamodpsw;
		this.valid = valid;
	}
	
	public Utente() {
		this.username = "";
		this.password = "";
		this.cognome = "";
		this.nome = "";
		this.datanascita = null;
		this.email = "";
		this.numerotelefono = "";
		this.ultimamodpsw = null;
		this.valid = false;
	}

	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDatanascita() {
		return datanascita;
	}
	public void setDatanascita(Date datanascita) {
		this.datanascita = datanascita;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumerotelefono() {
		return numerotelefono;
	}
	public void setNumerotelefono(String numerotelefono) {
		this.numerotelefono = numerotelefono;
	}
	public Date getUltimamodpsw() {
		return ultimamodpsw;
	}
	public void setUltimamodpsw(Date ultimamodpsw) {
		this.ultimamodpsw = ultimamodpsw;
	}
	
	public boolean isValid() {
		return valid;
	}
	
	public void setValid(boolean valid) {
		this.valid = valid;
	}
	
}
