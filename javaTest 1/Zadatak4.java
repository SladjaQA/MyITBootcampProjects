package javaTest;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {
		// NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih
		// valuta: evro, franak ili dolar
		// Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
		// 1 evro je 0,0085 dinara
		// 1 franak je 0,0093 dinara
		// 1 dolar je 0,010 dinara
		// Ispise vrsiti iskljucivo iz main metode

		// Primeri ispisa u konzoli:

		// Molim vas unesite iznos u dinarima:
		// 1200
		// Molim vas da unesete valutu u koju da konvertujemo dinare:
		// evro
		// 1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti

		// Primer ispisa u konzoli kad se unese pogresna valuta

		// Molim vas unesite iznos u dinarima:
		// 123
		// Molim vas da unesete valutu u koju da konvertujemo dinare:
		// zlato
		// Niste uneli dobru valutu

		Scanner sken = new Scanner(System.in);
		System.out.print("Molim vas unesite iznos u dinarima: ");
		double dinar = sken.nextDouble();
		System.out.print("Molim vas unesite valutu u koju da konvertujemo dinare: ");
		String valuta = sken.next();
		double rezultat = konvertor(dinar, valuta);
		if (rezultat == 0.0) {
			System.out.println("Niste uneli dobru valutu");
		} else {
			System.out.println(dinar + " dinara, kad se prebaci u " + valuta + " , iznosi " + rezultat + " u toj valuti");
		}

	}

	public static double konvertor(double iznos, String valuta) {
		double vraca = 0.0;
		switch (valuta) {
		case "evro":
			vraca = 0.0085 * iznos;
			return vraca;
		case "frank":
			vraca = 0.0093 * iznos;
			return vraca;
		case "dolar":
			vraca = 0.010 * iznos;
			return vraca;
		default:
			return vraca;
		}
	}
}
