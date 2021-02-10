package testKlase;

public class RekreativniPlaninar extends Planinar {

	private int tezinaOpreme;
	private String nazivOkruga;
	private double maxUsponBezOpreme;

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getNazivOkruga() {
		return nazivOkruga;
	}

	public double getMaxUsponBezOpreme() {
		return maxUsponBezOpreme;
	}

	public RekreativniPlaninar(int idPlaninara, String ime, String prezime, int tezinaOpreme, String nazivOkruga,
			double maxUsponBezOpreme) {
		super(idPlaninara, ime, prezime);
		this.tezinaOpreme = tezinaOpreme;
		this.nazivOkruga = nazivOkruga;
		this.maxUsponBezOpreme = maxUsponBezOpreme;
	}
	
	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + getIdPlaninara());
		System.out.println("ime: " + getIme() + " " + getPrezime());
		System.out.println("Okrug: " + getNazivOkruga());
	}

	@Override
	public double clanarinaPlaninara() {
		return 1_000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		if ((this.getMaxUsponBezOpreme() - this.tezinaOpreme * 50 )>planina.getVisinaPlanine()) {
			return true;
		} else {
			return false;
		}

	}

}
