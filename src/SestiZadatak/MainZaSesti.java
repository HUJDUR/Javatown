package SestiZadatak;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class MainZaSesti {

	public static void main(String[] args) throws MalformedURLException, IOException {

		Scanner url = new Scanner (new URL("http://www.textfiles.com/science/astronau.txt").openStream());
		
		int brojLinija = 0;
		
		while(url.hasNextLine()) {	
			brojLinija++;
			url.nextLine();
		}
		
		url.close();
		
		System.out.println(brojLinija);
	
	}

}
