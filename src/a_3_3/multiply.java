package a_3_3;

import inputTools.InputTools;

public class multiply {
	
	/*
	private static int a;
	private static int b;
	*/
	
	
	
	public static void main(String[] args)  {
		System.out.println("Guten Tag! Hier werden zwei Zahlen multipliziert. \n");		
		
		int a = InputTools.readInteger("Bitte Zahl 1 eingeben: ");
		
		int b = InputTools.readInteger("Bitte Zahl 2 eingeben: ");
		
		System.out.print("Das Ergebnis der Berechnung von " + a + " * " + b +" ist ");
		System.out.println(a * b + ".");
	}
	

	
}
