package b_3_4;

public class Verwaltung {
	
	public static void main(String[] args) {
		
		Mitarbeiter mita;
		mita = new Mitarbeiter(); //Erzeugung eines mitarbeiters
		
		mita.setNachname("Fischer");
		mita.setPersonalnummer(87236653);
		mita.setVorname("Thomas");
		
		System.out.println(mita);
		}

}
