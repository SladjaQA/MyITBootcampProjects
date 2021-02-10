package testKlase;

public class Alpinista extends Planinar {

	private int brojPoena;

	public Alpinista(int idPlaninara, String ime, String prezime, int brojPoena) {
		super(idPlaninara, ime, prezime);
		this.brojPoena = brojPoena;
	}

	public int getBrojPoena() {
		return brojPoena;
	}

	public void setBrojPoena(int brojPoena) {
		this.brojPoena = brojPoena;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + getIdPlaninara());
		System.out.println("ime: " + getIme() + " " + getPrezime());
		System.out.println("Broj poena: " + getBrojPoena());
	}

	@Override
	public double clanarinaPlaninara() {
		return 1_500 - (this.brojPoena * 50);
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if (planina.getVisinaPlanine() < 4_000) {
			return true;
		} else {
			return false;
		}

	}

}
