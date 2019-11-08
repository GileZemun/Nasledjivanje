package apstraktna.klasa;

public abstract class DodatnaOprema {
	
	public String dodatak;
	
	// ovo je klasicna metoda
	public void katalog() {
		System.out.println("Ovo je spisak kablova");
	}
	
	// ovo je apstraktna metoda
	public abstract void testiraj ();
  
  
	
	

}
