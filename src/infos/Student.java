package infos;

public class Student
	extends Hochschulangehoeriger {

	private int matrikelnr;
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String v) {
		vorname = v;
	}
	
	
	public int getMatrikelnr() {
		return matrikelnr;
	}
	public void setMatrikelnr(int matrikelnr) {
		this.matrikelnr = matrikelnr;
	}
	
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String n) {
		nachname = n;
	}
	
}