package a_7_3;

import a_7_1.Main;
import inputTools.InputTools;

public class Nachdenken {
	public static void nachdenka(int z) {
//		int z1 = 0;
//		int z2 = 0;
//		int z3 = 0;
		int j = 0;
		int eingabeZahl = z;
		
		
		while (eingabeZahl < 9) {
			//Main.erzeugen(z1, z2, z3);
			
			String s = Integer.toBinaryString(eingabeZahl); // Hier wird ein int zu einem Binary String umgewandelt
			int zahl = Integer.parseInt(s); //Hier wird der string zu int geparset
			
			int stelle4 = zahl % 10; 
			int stelle3 = (zahl/10) % 10;
			int stelle2 = (zahl/100) % 10;
			int stelle1 = (zahl/1000) % 10; 
			
			System.out.print(""+ stelle1 + " + " + stelle2 + " + " + stelle3 + " + " + stelle4 + " \n");
			
			eingabeZahl++;
		}
	}
	
	public static void main(String[] args) {

		int z0 = InputTools.readInteger("Zahl in Dezimal (Max 8):");
		Nachdenken.nachdenka(z0);
	}
}
