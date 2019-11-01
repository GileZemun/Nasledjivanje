package nasledjivanje;

public class SvemirskiObjekat {
	
	public String ime;
	public double zapremina;
	
	public SvemirskiObjekat (String i, double z) {
		
		this.ime = i;
		this.zapremina = z;
	
	}
	
	public void dobrodosli (String ime) {
		System.out.println("Dobrodosli na svemirski objekat " + ime);
	}

}
