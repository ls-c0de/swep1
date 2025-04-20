package quersumme;

import inputTools.InputTools;

/*
 * 
 */
public class Quersumme {

	public static void main(String[] args) {
		System.out.println("Guten Tag!");
		System.out.println("Dieses Programm "
				+ "berechnet eine Quersumme. \n");
		int zahl = InputTools.readInteger("Bitte geben Sie" //Eingabe anstatt von Zahl
				+ " eine Zahl von 0..9999 ein:");
	
		int stelle4 = zahl % 10;
		int stelle3 = (zahl/10) % 10;
		int stelle2 = (zahl/100) % 10;
		int stelle1 = (zahl/1000) % 10; //%10 kann man sich sparen
		
		//L�sung evtl. nicht so sch�n, da Reste nur durch int weggehen?
			
		System.out.print("Die Quersumme ist ");
		System.out.print(""+ stelle1 + " + " + stelle2 + " + " + stelle3 + " + " + stelle4 + " = ");
		System.out.println(stelle1 + stelle2 + stelle3 + stelle4);
		System.out.println(zahl);
		
		
	}
	

}
