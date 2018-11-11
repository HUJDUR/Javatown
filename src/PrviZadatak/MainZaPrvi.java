package PrviZadatak;

import java.io.IOException;

public class MainZaPrvi {

	public static void main(String[] args) throws IOException {
		
		Maratonac.rastavljanjeUcesnika();

		System.out.println(Maratonac.ispis(Maratonac.sortiranje().get(0)));
			
		
	}

}
