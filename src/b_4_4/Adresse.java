package b_4_4;

public class Adresse {

	private String ort;
	private String strasse;
	private String hausnummer;
	private int plz;
	
	public Adresse() { //beide Konstruktoren sind gefordert!
		
	}
	
	public Adresse(String ort, String strasse, String hausnummer, int plz) {
		this.ort = ort;
		this.strasse = strasse;
		this.hausnummer = hausnummer;
		this.plz = plz;
	}
	

	public String getOrt() {
		return ort;
	}
	public void setOrt(String ort) { //void = rückgabetyp
		this.ort = ort; //Lieber ort und kein this., da Zeitsparend
	} //Zuweisung von rechts nach links, erst ort wird ausgewertet
	
	
	public String getStrasse() {
		return strasse;
	}
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	
	
	public String getHausnummer() {
		return hausnummer;
	}
	public void setHausnummer(String hausnr) {
		hausnummer = hausnr;
	}
	
	
	public int getPlz() {
		return plz;
	}
	public void setPlz(int plz) {
		this.plz = plz;
	}
	
	public String toString() {   //Wieso müssen wir den String zweimal deklarieren?
		String erg;
		erg = plz +" " +ort +", " +strasse +" " +hausnummer;
		return erg;
	}
}
