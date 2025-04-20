package a_7_2;

import a_7_1.Main;

public class Ausgabe {

	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		int z1 = 0;
		int z2 = 0;
		int z3 = 0;

		System.out.println(" a | b | c | r ");
		System.out.println("---+---+---+---");
		
		while (i < 9) {

			System.out.print(" " + z3 + " |");
			System.out.print(" " + z2 + " |");
			System.out.print(" " + z1 + " | ");

			Main.erzeugen(z3, z2, z1);
			System.out.print("\n");
			
			if (z3 == 0 && z2 == 0 && z1 == 1) {
				z2++;
				z1 = 0;
			} else if (z3 == 0 && z2 == 1 && z1 == 1) {
				z3++;
				z1 = 0;
				z2 = 0;
			} else if (z3 == 1 && z2 == 0 && z1 == 1) {
				z2++;
				z1 = 0;
			} else if (z3 == 1 && z2 == 1 && z1 == 1) {
				System.out.println("FINISH");
				return;
			} else {
				z1++;
			}

//			System.out.print(" " + z3 + " |");
//			System.out.print(" " + z2 + " |");
//			System.out.print(" " + z1 + " | ");
//
//			Main.erzeugen(z3, z2, z1);
//			System.out.print("\n");

			i++;
		}
	}
}
