package testKlase;

public abstract class Planinar {

	protected int idPlaninara;
	protected String ime;
	protected String prezime;

	public Planinar(int idPlaninara, String ime, String prezime) {
		super();
		this.idPlaninara = idPlaninara;
		this.ime = ime;
		this.prezime = prezime;
	}

	public int getIdPlaninara() {
		return idPlaninara;
	}

	public String getIme() {
		return ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public abstract void stampaj();

	public abstract double clanarinaPlaninara();

	public abstract boolean uspesanUspon(Planina planina);
}
