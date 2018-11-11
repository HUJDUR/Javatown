package PrviZadatak;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maratonac  {
	
	private String imeUcesnika;
	private int vrijemeMaratona;
	
	static ArrayList<Maratonac> maratonci = new ArrayList<>();
	
	public Maratonac(String imeUcesnika, int vrijemeMaratona) {
		this.imeUcesnika = imeUcesnika;
		this.vrijemeMaratona = vrijemeMaratona;
		
		maratonci.add(this);
	}
	
	public Maratonac() {
		
	}
	
	public static void rastavljanjeUcesnika() throws FileNotFoundException {
		
		File maraton = new File("C:\\Users\\Korisnik\\Desktop\\maraton.txt");
		Scanner file = new Scanner(maraton);
		
		while(file.hasNextLine()) 
			new Maratonac(file.next(), file.nextInt());
		
		file.close();
	}
	
	public static Maratonac rezultat(String unos) {
		
		for (int i = 0; i < maratonci.size(); i++) 
			if (maratonci.get(i).imeUcesnika.equals(unos))
				return maratonci.get(i);
		
		
		return null;
	}
	
	public static int prosjecnoVrijeme() {
		
		int vrijeme = 0;
		
		for(int i = 0; i < maratonci.size(); i++) 
			vrijeme += maratonci.get(i).vrijemeMaratona;
		
		return vrijeme/maratonci.size();		
	}
	
	public static void najbrziUcesnici() throws IOException {
		
		ArrayList<Maratonac> najbrzi = new ArrayList<>();
		
		for(int i = 0; i < maratonci.size(); i++) {
			if(maratonci.get(i).vrijemeMaratona < 300)
				najbrzi.add(maratonci.get(i));
		}
		
		File file = new File("najboljiMaratonci.txt");
		FileWriter writer = new FileWriter(file);
		
		for(int i = 0; i < najbrzi.size(); i++)
			writer.write(najbrzi.get(i).imeUcesnika + " " + najbrzi.get(i).vrijemeMaratona + System.lineSeparator());
		
		writer.close();
	}
	
	public static ArrayList<Maratonac> sortiranje() {
		
		ArrayList<Maratonac> sortirani = new ArrayList<>();
		
		int[] vremena = new int[maratonci.size()];
		
		for (int i = 0; i < maratonci.size(); i++) 
			vremena[i] = maratonci.get(i).vrijemeMaratona;

		Arrays.sort(vremena);

		for (int i = 0; i < maratonci.size(); i++) 
			for (int j = 0; j < maratonci.size(); j++) 
				if (maratonci.get(j).vrijemeMaratona == vremena[i])
					sortirani.add(maratonci.get(j));
		
		return sortirani;
		
	}
	
	public static String ispis (Maratonac ucesnik) {
		return ucesnik.imeUcesnika + " " + ucesnik.vrijemeMaratona;
	}
	
	
}
