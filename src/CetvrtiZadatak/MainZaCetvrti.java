package CetvrtiZadatak;

import java.io.FileNotFoundException;

import PrviZadatak.Maratonac;

public class MainZaCetvrti {

	public static void main(String[] args) throws FileNotFoundException {
		
		Maratonac.rastavljanjeUcesnika();
		
		System.out.println("Prosjecno vrijeme je " + Maratonac.prosjecnoVrijeme());
	}

}
