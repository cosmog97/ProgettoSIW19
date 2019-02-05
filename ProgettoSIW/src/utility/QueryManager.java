package utility;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class QueryManager {
	
	public static String readFileAsString(String fileName) { 
		   String text = ""; 
		   try { 
			   text = new String(Files.readAllBytes(Paths.get(fileName))); 
		   }
		   catch (IOException e) { 
			   e.printStackTrace(); 
		   } 
		   return text; 
	   }


}
