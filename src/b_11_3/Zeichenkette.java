package b_11_3;

import inputTools.InputTools;

public class Zeichenkette {
	public static void main(String[] args) {
		int anzahl = 0;

		String a = InputTools.readString("Zu zaehlende Zeichenkette angeben:");
		char[] arr = new char[a.length()];

		// Put the String into a char array
		for (int i = 0; i < a.length(); i++) {
			arr[i] = a.charAt(i);
		}
		
		// search for "er" in char array
		int i = 0;
		while (i < a.length()) {
			if ((arr[i] == 'e' || arr[i] == 'E') && (arr[i + 1] == 'r' || arr[i + 1] == 'R')) {
				anzahl++;
				i++;
			} else {
				i++;
			}

		}
		
		System.out.println("Die Anzahl von 'er' im Text beträgt " +anzahl);
		System.out.println("Ende");
	}

}
