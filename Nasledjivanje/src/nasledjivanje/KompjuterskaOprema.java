package nasledjivanje;

public class KompjuterskaOprema extends Oprema {

	public String tipOpreme;
	public boolean daLiJeNovo;
	
	public KompjuterskaOprema() {
		
	}
	
	public KompjuterskaOprema(String proizvodjac, double cena, String tipOpreme, boolean daLiJeNovo) {
		
		super(proizvodjac,cena);
		this.tipOpreme = tipOpreme;
		this.daLiJeNovo = daLiJeNovo;
		
	}
	
	public void ukljuci() {
		System.out.println("Ukljucio sam se...");
	}
	
	
	  @Override 
	  public void barCode() {
		  System.out.println("Kompjuterski bar code je ovde"); 
	  }
	  
	 
	
}
