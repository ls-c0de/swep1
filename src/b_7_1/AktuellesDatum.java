package b_7_1;

import inputTools.InputTools;

public class AktuellesDatum {
	public static String abfragen() {

		int dd = InputTools.readInteger("Tag eingeben");
		int mm = InputTools.readInteger("Monat eingeben");

		return "" + dd + mm;
	}

}
