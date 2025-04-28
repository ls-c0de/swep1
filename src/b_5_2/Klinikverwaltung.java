package b_5_2;

import b_4_4.Adresse;
import inputTools.InputTools;

public class Klinikverwaltung { 

	public static void main(String[] args) {
		Adresse adr = new Adresse();
		Klinik k = new Klinik();
		
		String or = "KF";
		String str = "Alte Post";
		String hnr = "10";
		int plz = 87600;
		Adresse adr2 = new Adresse(or, str, hnr, plz); //Konstruktor wird mit Parametern aufgerufen
		
		String input = InputTools.readString("Name des Klinikums? :"); 
		k.setName(input);
		int input2 = InputTools.readInteger("Wie viele Betten hat das Krankenhaus?: ");
		k.setAnzahlBetten(input2);
		
//		adr.setHausnummer("50");
//		adr.setOrt("Kempten");
//		adr.setPlz(87439);	
//		adr.setStrasse("Robert-Weixler-Strasse");
	
		//k.setAnzahlBetten(510);
		
		k.setNotaufnahme(true); //EqualsIgnoreCase!!
		
		String erg = "" +k +"\n" +adr;

		System.out.println(k);
		//k.toString();
		//adr.toString();
		System.out.println(adr2);
	}
	
	
}
