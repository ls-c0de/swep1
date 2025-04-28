package b_8_1;

import inputTools.InputTools;

public class Haupt2 {
	public static void main(String[] args) {
		int n = InputTools.readInteger("Wie viele Figuren Bruder: ");

		Figur[] array = new Figur[n];

		for (int i = 0; i < n; i++) {
			int j = InputTools.readInteger("Kreis oder Eck");

			switch (j) {
			case 1:
				
				//array[i] = new Rechteck();
				break;
			case 2:
				array[i] = new Kreis();
				break;
			case 0:
				System.out.println("Quit");
				break;
			default:
			}

		}
	}

}
