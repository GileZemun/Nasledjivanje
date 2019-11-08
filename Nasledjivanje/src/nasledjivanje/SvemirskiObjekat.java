package nasledjivanje;

public class SvemirskiObjekat {
	
	public String ime;
	public double zapremina;
	
	public SvemirskiObjekat(String ime, double zapremina) {
		this.ime = ime;
		this.zapremina = zapremina;
	}
	
	public void dobrodosli(String ime) {
		System.out.println("Dobrodosli na svemirki objekat " + ime );
	}

}
