package testKlase;

import javax.sound.sampled.DataLine;

public class Main {

	public static void main(String[] args) {

		Planina planina1 = new Planina("Stara Planina", "Srbija", 2_376);

		Planinar r1 = new RekreativniPlaninar(1, "Jozef", "Tot", 3, "Severnobacki ", 551);
		Planinar r2 = new RekreativniPlaninar(2, "Marko", "Kralj", 7, "Moravicki ", 1_000);
		Planinar r3 = new RekreativniPlaninar(3, "Jovica", "Salatic", 5, "Zlatiborski ", 3_000);

		Planinar a1 = new Alpinista(4, "Zeljko", "Trbovc", 20);
		Planinar a2 = new Alpinista(5, "Ilija", "Krkic", 23);
		Planinar a3 = new Alpinista(6, "Danica", "Magoc", 30);

		Planinar[] nizPlaninara = { r1, r2, r3, a1, a2, a3 };

		for (int i = 0; i < nizPlaninara.length; i++) {
			nizPlaninara[i].stampaj();
			System.out.println("Planinar ce se popeti na Staru planinu: " + nizPlaninara[i].uspesanUspon(planina1));
			System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		}

		int suma = 0;
		for (int i = 0; i < nizPlaninara.length; i++) {
			suma += nizPlaninara[i].clanarinaPlaninara();
		}
		System.out.println("Zbir svih clanarina planinara iznosi: " + suma);

	}

}
