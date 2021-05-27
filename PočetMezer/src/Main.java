import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.File;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	      File file = new File("PoèetMezer\\lm.txt"); 
	      String loremIpsum = new String(Files.readAllBytes(Paths.get(file.getName())));
	      
	      int Mezery = 0;
	      int Slova = 1;
	      for (int i = 0; i < loremIpsum.length(); i++) {
	    	  if(loremIpsum.charAt(i) == ' ') {
	    		  Mezery++;
	    		  Slova++;
	    	  }
		}
	      System.out.println("text má " + Mezery + " mezer a " + Slova + " slov");	      
	}

}
