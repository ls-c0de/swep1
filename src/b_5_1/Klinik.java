package b_5_1;


public class Klinik {
	private int anzahlBetten;
	private String name;
	private boolean notaufnahme;

	public String toString() {
		return "Name:" +name +", " +" Bettenanzahl:" +anzahlBetten +", " 
	    +" Gibt es eine Notaufnahme?:" +notaufnahme;
	}
	public void setAnzahlBetten(int ab) {
		anzahlBetten = ab;
	}
	public void setName(String n) {
		name = n;
	}
	public void setNotaufnahme(boolean nt) {
		notaufnahme = nt;
	}
	
	
	
	public int getAnzahlBetten() {
		return anzahlBetten;
	}
	public String getName() {
		return name;
	}
	public boolean getNotaufnahme() {
		return notaufnahme;
	}
	



}
