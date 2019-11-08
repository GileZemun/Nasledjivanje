package nasledjivanje;

import interfejs.Iconstruct;

public final class HardDisc extends KompjuterskaOprema implements Iconstruct{
	
	// final class se ne moze naslediti
	
	public double kapacitet;
	public boolean daLiJeSSD;
	
	public void defragmentiraj() {
		System.out.println("Defragmentacija pokrenuta...........");
	}
	
	@Override
	public void ukljuci() {
		System.out.println("Upalio sam hard disc...");
	}
	
	
	@Override 
	public void barCode() {
		System.out.println("HDD bar code je ovde"); 
	}

	@Override
	public void install() {
		System.out.println("Instaliram Hard DIsc");	
	}

	@Override
	public void uninstall() {
		System.out.println("Razlupao sam Hard Disc");
	}

}
