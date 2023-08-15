package hu.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Beolvas {
	
	private String beolvas;
	private int tombmeret;
	private char[] szetszed;
	

	public void beolvasas() {
	try {
	      File myObj = new File("szoveg.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	       beolvas = myReader.nextLine();
	       System.out.println(beolvas);
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Valami hiba történt...");
	      e.printStackTrace();
	    }
}
	
	public void tombbe() {
		szetszed = new char[beolvas.length()];
		for(int i = 0; i<beolvas.length(); i++) {
			szetszed[i] = beolvas.charAt(i);
			tombmeret++;
		}	
	}

	public int getTombmeret() {
		return tombmeret;
	}

	public void setTombmeret(int tombmeret) {
		this.tombmeret = tombmeret;
	}

	public char[] getSzetszed() {
		return szetszed;
	}

	public void setSzetszed(char[] szetszed) {
		this.szetszed = szetszed;
	}

	public String getBeolvas() {
		return beolvas;
	}

	public void setBeolvas(String beolvas) {
		this.beolvas = beolvas;
	}
	
}
