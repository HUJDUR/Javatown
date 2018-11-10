package TreciZadatak;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Maratonac {
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
	
	public static void rastavljanjeMaratonaca() throws FileNotFoundException {
		
		File maraton = new File("C:\\Users\\Korisnik\\Desktop\\maraton.txt");
		Scanner file = new Scanner(maraton);
		
		while(file.hasNextLine()) 
			new Maratonac(file.next(), file.nextInt());
		
		file.close();
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
