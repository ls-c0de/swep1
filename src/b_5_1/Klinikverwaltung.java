package b_5_1;

import b_4_4.Adresse;

public class Klinikverwaltung {

	public static void main(String[] args) {
		Adresse adr = new Adresse();
		Klinik k = new Klinik();
		
		adr.setHausnummer("50");
		adr.setOrt("Kempten");
		adr.setPlz(87439);	
		adr.setStrasse("Robert-Weixler-Strasse");
	
		k.setAnzahlBetten(510);
		k.setName("Klinikum Kempten");
		k.setNotaufnahme(true);
		
		String erg = "" +k +"\n" +adr;

		System.out.println(erg);
	}
	
	
}
