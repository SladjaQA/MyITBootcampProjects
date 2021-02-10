
package javaTest;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {
//Napisati program koji racuna potrosnju goriva
//Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva 
		// biti potroseno
//Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara
		// na 100 kilometara,
//kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
		double potrosnjaGoriva = 0;
		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite distancu u kilometrima: ");
		double distanca = sken.nextInt();
		System.out.print("Unesite tip vozila: ");
		String vozilo = sken.next();
		switch (vozilo) {
		case "Motor":
			potrosnjaGoriva = (5 * distanca) / 100;
			break;
		case "Automobil":
			potrosnjaGoriva = (7 * distanca) / 100;
			break;
		case "Kombi":
			potrosnjaGoriva = (11 * distanca) / 100;
			break;
		case "Kamion":
			potrosnjaGoriva = (15 * distanca) / 100;
			break;
		default:
			System.out.println("Uneli ste pogresan tip vozila.");
			break;
		}
		System.out.println("Za distancu od " + distanca + " potroseno je " + potrosnjaGoriva + " litara goriva.");
		System.out.println("Kraj programa.");
	}

}
