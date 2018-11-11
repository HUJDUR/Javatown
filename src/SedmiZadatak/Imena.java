package SedmiZadatak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Imena {
	
	private String ime;
	static ArrayList<Imena> imena = new ArrayList<>();
	
	public Imena(String ime) {
		this.ime = ime;
		
		imena.add(this);
	}
	
	public static void rastavljanjeImena() throws FileNotFoundException {
		
		File fajl = new File("C:\\Users\\Korisnik\\eclipse-workspace\\Javatown\\imena.txt");
		Scanner file = new Scanner(fajl);
		
		while(file.hasNextLine()) {
			new Imena(file.nextLine());
		}
		
		file.close();
	}
	
	public static ArrayList<String> sortiranje() {
		
		ArrayList<String> sortiranaImena = new ArrayList<>();
		
		for (int i = 0; i < imena.size(); i++)
			sortiranaImena.add(imena.get(i).ime);
		
		Collections.sort(sortiranaImena);
				
		return sortiranaImena;
		
	}
	
	public static String ispis(Imena ime) {
		return ime.ime;
	}

}
