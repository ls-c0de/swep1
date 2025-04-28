package b_10_1;

public class Pruefung {
	private String lehrveranstaltung;
	private int creditpoints;
	private double note;
	private static int anzahl;
	private int instance;
	
	public String toString() {
		//vlt mit formatter arbeiten?
		return instance +": | "+lehrveranstaltung +" | " +creditpoints +" | " + note ; 
	}	//Unterschied wenn man hier getter nimmt?
	
	public Pruefung(String a, int b, double c) {
		lehrveranstaltung = a;
		creditpoints = b;
		note = c;
		
		anzahl++;
		instance = anzahl;
	}
	public Pruefung() {
		anzahl++;
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
