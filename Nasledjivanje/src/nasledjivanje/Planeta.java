package nasledjivanje;

public class Planeta extends SvemirskiObjekat {
		
	public boolean voda;
	
	public Planeta (String i, double z, boolean voda) {
		
		super(i,z);
		this.voda = voda;
		
	}
	
	@Override
	public void dobrodosli (String ime) {
		System.out.println("Dobrodosli na planetu " + ime);
	}

	
}
