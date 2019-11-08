package apstraktna.klasa;

import interfejs.Iconstruct;

public class Kablovi extends DodatnaOprema implements Iconstruct {
	
	public String modelKabla;
	
	@Override
	public void katalog() {
		System.out.println("Katalog kablova.........");
	}
	
	@Override
	public void testiraj () {
		System.out.println("Testiram kablove...........");
	}

	@Override
	public void install() {		
		System.out.println("Polozi kablove");
	}

	@Override
	public void uninstall() {		
		System.out.println("Iscupaj kablove");	
	}
	
	
	
	

}
