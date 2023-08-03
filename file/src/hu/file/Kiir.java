package hu.file;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Kiir {
	
	private String beker;

	public String getBeker() {
		return beker;
	}

	public void setBeker(String beker) {
		this.beker = beker;
	}
	
	public void adatbeker() {
		System.out.print("Kérem adja meg a szöveget: ");
			Scanner sc = new Scanner(System.in);
			beker = sc.nextLine();
			
			 try {
			      FileWriter fajlba = new FileWriter("szoveg.txt");
			      fajlba.write(beker);
			      fajlba.close();
			      System.out.println("A szöveg sikeresen kiíródott a fájlba");
			    } catch (IOException e) {
			      System.out.println("A fájlba írás nem sikerült");
			      e.printStackTrace();
			    }
		
	}
	

}
