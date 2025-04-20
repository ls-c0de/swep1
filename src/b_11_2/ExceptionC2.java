package b_11_2;

import inputTools.InputTools;

public class ExceptionC2 {
	public static void main(String[] args) {
		final int MAX_ARRAY = 5;
		int[] a = new int[MAX_ARRAY];

		// int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie
		// eingeben?:");
		// Eingabe:

		int anzahl = 0;
		while (true) {
			try {
				anzahl = zahlEingabe();
				break;
			} catch (Exception e) { //Ist es egal, was wir hier eingeben bei Exception?
				System.out.println(e.getMessage() + "\nSie wollen mehr Zahlen eingeben, als das Array Stellen hat");
			}
		}

		for (int i = 0; i < anzahl; i++) {
			a[i] = InputTools.readInteger("Eingabe Zahl " + i + ": ");
		}

	}

	public static int zahlEingabe() throws Exception {
		int anzahl = InputTools.readInteger("Wie viele Elemente möchten Sie eingeben?:");
		if (anzahl > 5) {
			throw new Exception("Achtung! Array zu klein");
		} else
			return anzahl;

	}
}