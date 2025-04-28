package b_7_1;

import inputTools.InputTools;

public class Person {

	private String name;
	private int geburtsTag;
	private int geburtsMonat;
	private int geburtsJahr;
	private boolean konsistent = false;
	private static int anzahl = 0;
	
	public Person() {
	}
	public Person(String n, int gt, int gm, int gj) {
		setName(n);
		setGeburtsJahr(gj);
		setGeburtsMonat(gm);
		setGeburtsTag(gt);
	}
//	private void init() {
//		boolean konsistent = false;
//	}

	public String toString() {
		String [] arr = {"Ungueltig" ,"Januar","Februar","Maerz", "April","Mai", "Juni", "Juli", 
				"August", "September", "Oktober", "November", "Dezember" };
		
		anzahl += 1; 
		
		return "Person " +(anzahl) +": \n" 
		+" " +name +"\n" 
		+" "+geburtsTag +"." +arr[geburtsMonat] +" " +geburtsJahr +"\n "
		+"Alter: " +alter(2023);
	}
	
	private int error() {
		int wert = InputTools.readInteger("Eingabe korrigieren: ");
		if (konsistent == true) {
			konsistent = false;
			System.out.println("Ergebnis: ");
		}
		//System.out.println("Ergebnis: ");
		return wert;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getGeburtsTag() {
		return geburtsTag;
	}
	public void setGeburtsTag(int eing) {
		int getm = getGeburtsMonat();
		if (getm == 2) {
			if (eing >= 1 && eing <= 28) {
				geburtsTag = eing;
			} else {
				System.out.println("Falsche Eingabe (Februar hat nur 28 Tage)");
				setGeburtsTag(error());
			}
			
		} else if (getm == 1 || getm == 3 || getm == 5 || getm == 7 || getm == 8 || getm == 10 || getm == 12) {
			if (eing >= 1 && eing <= 31) {
				geburtsTag = eing;
				
			} else {
				System.out.println("Falsche Eingabe (Dieser Monat hat 31 Tage)");
				setGeburtsTag(error());
			}
		} else {
			if (eing >= 1 && eing <= 30) {
				geburtsTag = eing;
				
			} else {
				System.out.println("Falsche Eingabe (Dieser Monat hat 30 Tage)");
				setGeburtsTag(error());
			}
		}
	}

	public int getGeburtsMonat() {
		return geburtsMonat;
	}
	public void setGeburtsMonat(int eing) {
		setKonsistent(false);
		while (konsistent == false) {
			if (eing <= 12 && eing >= 1) {
				geburtsMonat = eing;
				setKonsistent(true);
				
			} else {
				setKonsistent(true);
				System.out.println("Der Geburtsmonat war falsch! ");
				setGeburtsMonat(error());
			}
		}
	}

	public int getGeburtsJahr() {
		return geburtsJahr;
	}

	public void setGeburtsJahr(int eing) {
		setKonsistent(false);
		while (konsistent == false) {
			if (eing >= 1900) {
				geburtsJahr = eing;
				setKonsistent(true);
				
			} else {
				setKonsistent(true);
				System.out.println("Das Geburtsjahr war falsch! ");
				setGeburtsJahr(error());
			}
		}
	}
	
	public void setKonsistent(boolean eing) {
		konsistent = eing;
	}
	public int alter(int aj) {
		return aj - getGeburtsJahr();
	}
	
}
