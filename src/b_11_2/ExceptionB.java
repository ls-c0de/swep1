package b_11_2;

import inputTools.InputTools;

public class ExceptionB {

	public static void main(String[] args) {
		final int MAX_ARRAY = 5;
		int[] a = new int[MAX_ARRAY];

		int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie eingeben?:");
		// Eingabe:

		try {
			for (int i = 0; i < anzahl; i++) {
				a[i] = InputTools.readInteger("Eingabe Zahl " + i + ": ");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage() + "\n Du gibts mehr Zahlen ein als das Array Stellen hat");
		}

	}
}