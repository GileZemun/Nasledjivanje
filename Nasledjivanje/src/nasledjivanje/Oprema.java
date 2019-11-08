package nasledjivanje;

public class Oprema {
	
	public String proizvodjac;
	public double cena;
	
	public Oprema() {
		
	}
	
	public Oprema(String proizvodjac, double cena) {
		this.proizvodjac = proizvodjac;
		this.cena = cena;
	}

	public void barCode() {
		System.out.println("Oprema barcode je ovde");
	}
	
	
	public static final void alaJeLepaOvaOprema() {
		System.out.println("Bas je lepa oprema!");
	}
	
	
}
