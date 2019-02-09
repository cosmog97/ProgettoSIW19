package controller;

import java.io.PrintWriter;
import java.util.List;

import org.json.JSONObject;

import com.google.gson.Gson;

import model.Evento;
import persistance.DatabaseManager;
import persistance.EventoDAO;

public class test {

	public static void main(String[] args) {
		EventoDAO t = DatabaseManager.getInstance().getDaoFactory().getEventoDAO();
		List<Evento> temp = t.findAll();



		  Gson gson = new Gson();
	      System.out.println(gson.toJson(temp));
		    // put some value pairs into the JSON object .


		    // finally output the json string       

	}

}
