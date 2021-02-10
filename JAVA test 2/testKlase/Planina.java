package testKlase;

public class Planina {
	private String ime;
	private String drzava;
	private double visinaPlanine;

	public Planina() {

	}

	public Planina(String ime, String drzava, double visinaPlanine) {
		super();
		this.drzava = drzava;
		this.visinaPlanine = visinaPlanine;
		this.ime = ime;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getDrzava() {
		return drzava;
	}

	public void setDrzava(String drzava) {
		this.drzava = drzava;
	}

	public double getVisinaPlanine() {
		return visinaPlanine;
	}

	public void setVisinaPlanine(double visinaPlanine) {
		this.visinaPlanine = visinaPlanine;
	}

}
