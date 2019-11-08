package nasledjivanje;

public class Planeta extends SvemirskiObjekat {
	
	public boolean voda;
	
	public Planeta(String ime, double zapremina, boolean voda) {
		
		super(ime, zapremina);
		this.voda = voda;
		
	}
	
	@Override
	public void dobrodosli(String ime) {
		System.out.println("Dobrodosli na planetu " + ime );
	}

}
