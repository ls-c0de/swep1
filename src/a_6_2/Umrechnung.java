package a_6_2;

import inputTools.InputTools;

public class Umrechnung {

	public static void main(String[] args) {
		System.out.println("Dieses Programm rechnet Temperaturen um");
		int input = InputTools.readInteger("Umrechnungsrichtung (0== C->F, 1== F->C): ");
		
		if (input == 0) {
			double in0 = InputTools.readDouble("Bitte Celsius angeben: ");
			double fahrenheit = ((double) 9/5) * in0 + 32;
			System.out.println("Fahrenheit = " +fahrenheit);
			
		} else if (input == 1) {
			double in1 = InputTools.readDouble("Bitte Fahrenheit angeben:");
			double celsius = (in1 - 32)*5/9;
			System.out.println("Celsius = " +celsius);
		} else {
			System.out.println("Eingabe falsch!");
		}
		
		
	}
}
