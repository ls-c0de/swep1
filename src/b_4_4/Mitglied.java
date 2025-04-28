package b_4_4;

public class Mitglied {
	private int mitgliedsnr;
	private String vorname;
	private String nachname;
	private Adresse anschrift; //Was kann ich damit machen?
	//Diese Beziehung wird zu einem Attribut
	
	public Mitglied(int m, String v, String n, Adresse a) {
		mitgliedsnr = m;
		vorname = v;
		nachname = n;
		anschrift = a;
	}
	public int getMitgliedsnr() {
		return mitgliedsnr;
	}
	public void setMitgliedsnr(int mitgliedsnr) {
		this.mitgliedsnr = mitgliedsnr;
	}
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nach) {
		nachname = nach;
	}
	
	public Adresse getAnschrift() {
		return anschrift;
	}
	public void setAnschrift(Adresse anschrift) {
		this.anschrift = anschrift;
	}
	
	
	public String toString() {
		String mitglied;
		mitglied = vorname +", " + nachname + "\n";
		mitglied += "(" + mitgliedsnr + ")";
		mitglied += " "+ anschrift;
		return mitglied;
	}
	

	
}
