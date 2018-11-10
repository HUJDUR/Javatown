package DrugiZadatak;

import java.io.FileNotFoundException;

import PrviZadatak.Maratonac;

public class Main {

	public static void main(String[] args) throws FileNotFoundException {
		
		Maratonac.rastavljanjeMaratonaca();

		for(int i = 0; i < Maratonac.sortiranje().size(); i++)
			System.out.println(Maratonac.ispis(Maratonac.sortiranje().get(i)));
		
	}

}
