package SedmiZadatak;

import java.io.FileNotFoundException;

public class MainZaSedmi {

	public static void main(String[] args) throws FileNotFoundException {
		
		Imena.rastavljanjeImena();
		
		for(int i = 0; i < Imena.sortiranje().size(); i++) 
			System.out.println(Imena.sortiranje().get(i));
		
	}

}
