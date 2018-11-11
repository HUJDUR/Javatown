package TreciZadatak;

import java.io.FileNotFoundException;
import java.util.Scanner;

import PrviZadatak.Maratonac;

public class MainZaTreci {

	public static void main(String[] args) throws FileNotFoundException {
		
		Maratonac.rastavljanjeUcesnika();

		Scanner input = new Scanner(System.in);
		System.out.println("Za kojeg ucesnika vas zanima rezultat?");
		String unos = input.next();
		input.close();
						
		try {
			System.out.println(Maratonac.ispis(Maratonac.rezultat(unos)));
		} catch (Exception e) {
			System.out.println("Ne postoji taj ucesnik...");

		}

	}

}
