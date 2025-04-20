package a_6_1;

import inputTools.InputTools;

public class Ostern {

	public static void main(String[] args) {
		
		System.out.println("Osterdatumberechnung zwischen 1900 und 2099");
		int eing = InputTools.readInteger("Vierstellige Jahreszahl: ");
		
		if (1900 <= eing && eing <= 2099) { //vlt anders möglich
			// 1900 <= eing <= 2099
			// eing > 1899 && eing <= 2099
			int n = eing -1900; //Formelsammlung nach O'Beirne
			int a = n %19;
			int b = (7 *a +1) /19; //Hier hatte ich die Klammern vergessen
			int m = (11 *a +4 -b) %29;
			int q = n /4;
			int w = (n +q +31 -m) %7;
			int p = 25 -m -w;
			
			//System.out.println(p); zur ueberpruefung der variablen p
			
			if (p > 0) {
				System.out.println("Ostersonntag: " +p +". April");
			} else {
				p = p+31; //ansonsten wird nur concateniert
				System.out.println("Ostersonntag: " +p +". März"); 
			}
			
		} else {
			System.out.println("Ungültige Jahreszahl");
		}
		
	}
}
