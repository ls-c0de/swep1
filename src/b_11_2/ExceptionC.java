package b_11_2;

import inputTools.InputTools;

public class ExceptionC {

	public static void main(String[] args) {
		final int MAX_ARRAY = 5;
		int[] a = new int[MAX_ARRAY];

		int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie eingeben?:");
		// Eingabe:
		try {
			arrayFuellen(anzahl, a);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void arrayFuellen(int anzahl, int[] a) throws Exception {
		for (int i = 0; i < anzahl; i++) {
			a[i] = InputTools.readInteger("Eingabe Zahl " + i + ": ");
		}
	}

}