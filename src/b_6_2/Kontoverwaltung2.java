package b_6_2;

import b_7_1.Person;
import inputTools.InputTools;

public class Kontoverwaltung2 {
	public static void main(String[] args) {
		
		Girokonto k1 = new Girokonto(1200, 12345);
		Kreditkartenkonto k2 = new Kreditkartenkonto(1000, 54321);
		Sparkonto k3 = new Sparkonto(200, 54123);
		
		int k = InputTools.readInteger("betrag angeben :");
		
		ueberweisen(k1, k3, k);
		System.out.println(k1.toString());
		System.out.println(k2.toString());
		System.out.println(k3.toString());
		
	}
	
	public static String ueberweisen(Konto k1, Konto k2, int b) {
		
		k1.auszahlen(b);
		k2.einzahlen(b);
		
		return "Erfolgreich!";
	}

}
