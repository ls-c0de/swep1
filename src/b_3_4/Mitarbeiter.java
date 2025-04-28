package b_3_4;

public class Mitarbeiter {
	
	private String vorname;
	private String nachname;
	private int personalnummer;
	
	
	public String getVorname() {
		return vorname;
	}
	public void setVorname(String vorname) {
		this.vorname = vorname;
	}
	
	
	public String getNachname() {
		return nachname;
	}
	public void setNachname(String nachname) {
		this.nachname = nachname;
	}
	
	
	public int getPersonalnummer() {
		return personalnummer;
	}
	public void setPersonalnummer(int personalnummer) {
		this.personalnummer = personalnummer;
	}

	
	public String toString() {
		String erg;
		erg = vorname + ", " + nachname + "\n";
		erg += " (" + personalnummer + ") ";
		return erg;
	}
	
}