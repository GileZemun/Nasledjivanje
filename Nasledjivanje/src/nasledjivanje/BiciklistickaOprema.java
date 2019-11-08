package nasledjivanje;

public class BiciklistickaOprema extends Oprema {
	
	public String tip;
	public boolean daLiJeDeciji;
	
	public void vozi() {
		System.out.println("Vozim bajs!!!!");
	}
	
	@Override
	public void barCode() {
		System.out.println("Biciklisticki bar code je ovde");
	}

}
