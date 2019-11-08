package nasledjivanje;

import apstraktna.klasa.DodatnaOprema;
import apstraktna.klasa.Kablovi;
import interfejs.Iconstruct;

public class Glavna {

	public static void main(String[] args) {
	
		/*
		 * Oprema oprema = new Oprema(); oprema.proizvodjac = "Nike"; oprema.barCode();
		 * Oprema.alaJeLepaOvaOprema();
		 * 
		 * Oprema o2 = new Oprema("Adidas",56);
		 * 
		 * KompjuterskaOprema komp = new KompjuterskaOprema();
		 * 
		 * komp.tipOpreme = "Laptop"; komp.proizvodjac = "Lenovo"; komp.daLiJeNovo =
		 * true; komp.cena = 450;
		 * 
		 * komp.ukljuci(); komp.barCode(); komp.alaJeLepaOvaOprema();
		 * 
		 * KompjuterskaOprema komp2 = new KompjuterskaOprema("HP",250,"Laptop",false);
		 * 
		 * komp2.barCode(); System.out.println("Cena kompa 2 je: " + komp2.cena +
		 * " evra");
		 * 
		 * BiciklistickaOprema bajs = new BiciklistickaOprema();
		 * 
		 * bajs.daLiJeDeciji = false; bajs.proizvodjac = "BMX";
		 * 
		 * 
		 * 
		 * bajs.vozi(); bajs.barCode();
		 * 
		 * 
		 * HardDisc hdd = new HardDisc();
		 * 
		 * hdd.daLiJeSSD = true; hdd.daLiJeNovo = true; hdd.cena = 75;
		 * 
		 * hdd.ukljuci(); hdd.defragmentiraj(); hdd.barCode();
		 * 
		 * 
		 * Kablovi kablovi = new Kablovi(); kablovi.dodatak = "konektori";
		 * kablovi.modelKabla = "RJ256";
		 */
			
		/*
		 * Kablovi k = new Kablovi();
		 * 
		 * k.dodatak = "kabl"; k.modelKabla = "Ja sam pomocni kabl";
		 * 
		 * k.katalog(); k.testiraj(); k.install(); k.uninstall();
		 */
		
		Oprema oprema = new Oprema ();
			oprema.barCode();
		
		Oprema komp = new KompjuterskaOprema();
			komp.barCode();
		 
		Oprema hdd = new HardDisc();
			hdd.alaJeLepaOvaOprema();
			
		DodatnaOprema kablovi = new Kablovi();
			kablovi.testiraj();
			
		Iconstruct sagradi = new Iconstruct() {
			
			@Override
			public void uninstall() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void install() {
				// TODO Auto-generated method stub
				
			}
		};
		
		Iconstruct sagradjuj = new HardDisc();
			sagradjuj.install();
			sagradjuj.uninstall();	

	}

}
