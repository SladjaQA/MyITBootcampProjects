package javaTest;

import java.util.Iterator;
import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {
//NAPISATI FUNKCIJU koja racuna koliko se puta neki broj pojavljuje u nizu
		// Proizvoljno napravite niz od 10 brojeva
		// korisnik unosi broj koji zeli da prebroji u nizu

		int[] niz = { 2, 12, 432, 21, 2, 7, 12, 2, 21, -2 };
		int brojac = 0;
		Scanner sken = new Scanner(System.in);
		System.out.print("Unesite broj koji zelite da prbrojimo u nizu brojeva: ");
		int num = sken.nextInt();
		for (int i = 0; i < niz.length; i++) {
			if (niz[i] == num) {
				brojac++;
			}
		}
		if (brojac <= 0) {
			System.out.println("Broj " + num + " se ne pojavljuje u nasem nizu.");
		} else {
			System.out.println("Broj " + num + " se pojavljuje " + brojac + " puta u nasem nizu brojeva");
		}

	}
}
