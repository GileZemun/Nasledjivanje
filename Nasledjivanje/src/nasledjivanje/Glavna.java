package nasledjivanje;

public class Glavna {

	public static void main(String[] args) {
		
		
		SvemirskiObjekat objekat = new SvemirskiObjekat("NGC 1290!", 2000000);
		
		
			
			objekat.dobrodosli(objekat.ime);
			
		
		Planeta planeta = new Planeta("Zemlja", 6788810, true);
		
			planeta.voda = true;
			planeta.ime = "Zemlja";		
			System.out.println("Da li na planeti ima vode? Odgovor: " + planeta.voda + ".");
			System.out.println("Vi ste na planeti " + planeta.ime + ".");
			planeta.dobrodosli(planeta.ime + ".");
		
			
		/*
		 * SvemirskiObjekat x = new Planeta(); x.dobrodosli("X.");
		 * 
		 * Planeta A = (Planeta) objekat; System.out.println(A.ime); // zasto ne radi?
		 */		
			
			
		
		
		
		
		
		

	}

}
