package b_10_1;

public class Pruefung2 {
	private String lehrveranstaltung;
	private int creditpoints;
	private double note;
	private static int anzahl;
	private int instance;
	private static Pruefung2[] arr = new Pruefung2[2];

	public static void sortieren() {
		int rand = 0;
		for (rand = 0; rand < arr.length; rand++) {
			if (arr[rand] == null)
				break;
		}
		for (int j = 0; j < rand; j++) {
			for (int i = 0; i < rand - 1 - j; i++) {
				if (arr[i].getNote() > arr[i + 1].getNote()) {
					Pruefung2 temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}

	public String toString() {
		// vlt mit formatter arbeiten?
		return instance + ": | " + lehrveranstaltung + " | " + creditpoints + " | " + note;
	} // Unterschied wenn man hier getter nimmt?

	public Pruefung2() {
		referenz(this); // java lang object oder so
		anzahl++;
//		instance = anzahl;
	}

	public Pruefung2(String a, int b, double c) {
		this(); // this muss hier stehen wegen aufruf des konstruktors der superklasse
		lehrveranstaltung = a;
		creditpoints = b;
		note = c;

	}

	private static void referenz(Pruefung2 p) {
		int i;
		for (i = 0; i > arr.length; i++) {
			if (arr[i] == null) {
				arr[i] = p;
				break;
			}
			if (i == arr.length) {
				Pruefung2[] arr2 = new Pruefung2[i * 2];
				for (int j = 0; j < arr.length; j++) { // Aus altem Array kopieren
					arr2[j] = arr[j];
				}
				arr2[arr.length] = p;
				arr = arr2;
			}

		}
	}
	
	public static Pruefung2[] getArray() {
		return arr;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public String getLehrveranstaltung() {
		return lehrveranstaltung;
	}

	public void setLehrveranstaltung(String lehrveranstaltung) {
		this.lehrveranstaltung = lehrveranstaltung;
	}

	public int getCreditpoints() {
		return creditpoints;
	}

	public void setCreditpoints(int creditpoints) {
		this.creditpoints = creditpoints;
	}

	public double getNote() {
		return note;
	}

	public void setNote(double note) {
		this.note = note;
	}

}
