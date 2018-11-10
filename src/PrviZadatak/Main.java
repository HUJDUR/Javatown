package PrviZadatak;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		Maratonac.rastavljanjeMaratonaca();

		System.out.println(Maratonac.ispis(Maratonac.sortiranje().get(0)));
			
		
	}

}
