package a_10_6;

import java.util.Random;

import inputTools.InputTools;

//Das ist ein händischer Selection Sort Algorythmus, weil die liste sortiert ist!

public class ZahlenRaten {
	public static void main(String[] args) {
		// double y =Math.random();
		Random rand = new Random(); // Hier wird die Zahl ausgedacht
		int randnr = rand.nextInt(501);

		//braucht man doch garnicht!
		int[] a = new int[501]; // Array mit allen Zahlen
		for (int i = 0; i < 501; i++) { // mit 500 funzt es, mit 501 nicht??
			a[i] = i;
		}
		
		System.out.println(randnr + "\n");
		neune();
		
		while (true) {
			int x = InputTools.readInteger("Welche Zahl war es?");

			if (x == randnr) {
				System.out.println("Congrats! Nummer war richtig!");
				break;
			}
			if (x > randnr) {
				System.out.println("Nummer war zu groß!");
			}
			if (x < randnr) {
				System.out.println("Nummer war zu klein!");
			}
		}
	}
	
	public static void neune() {
		int erg = 500;
		int i = 9;
		//Nach 9 Iterationen kommt bereits die Null raus, deswegen reichen 9 Durchläufe
		for (int j = 0;j < i; j++) {
			erg = erg / 2;
			System.out.println(erg);
		}
		
	}

}
