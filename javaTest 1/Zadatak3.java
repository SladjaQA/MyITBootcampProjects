package javaTest;

import java.util.Iterator;
import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {
//Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, 
		// sve dok korisnik ne unese 0

		Scanner sken = new Scanner(System.in);

		int num;
		int sum = 0;
		for (int j = 1; j > 0; j++) {
			System.out.println("Molim Vas unesite " + j + " broj");
			num = sken.nextInt();
			if (num == 0) {
				System.out.println("Uneli ste 0 Kraj programa");
				break;
			} else {
				sum = sum + num;
				System.out.println("Trenutni zbir je " + sum);
			}
		}
	}
}