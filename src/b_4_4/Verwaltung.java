package b_4_4;

public class Verwaltung {

	public static void main(String[] args) {
		
		//mit.getAnschrift();
		
		Adresse a;
		a = new Adresse("Kaufbeuren", "Alte Post Str.", "10b", 87600);
		
		/*
		a.setHausnummer("1b");
		a.setOrt("Kaufbeuren");
		a.setPlz(87600);
		a.setStrasse("Rudolf-Diesel-Str");
		*/
		Mitglied m;    //was passiert hier?
		m = new Mitglied(1234, "Alex", "Peters", a);
		
		m.setMitgliedsnr(1234);
		m.setNachname("Mueller");
		m.setVorname("Heinz");
		m.setAnschrift(a);
		
		/* Leider nicht zu gebrauchen, da nicht mehr der Standardkonstruktor benutzt wird
		 * 
		Adresse b;
		b = new Adresse();
		
		b.setHausnummer("23");
		b.setOrt("Kaufbeuren");
		b.setPlz(87600);
		b.setStrasse("Alte-Post-Str");
		
		Mitglied m2;    //was passiert hier?
		m2 = new Mitglied();
		
		m2.setMitgliedsnr(4321);
		m2.setNachname("Stadler");
		m2.setVorname("Alois");
		*/
		
		//Unterschied Instanz und Objekt
		
		System.out.println(m.toString() +"\n" +a.toString() +"\n");
		System.out.println(m);  //Unterschied zwischen den Methoden
		//System.out.println(m2.toString() +"\n" +b.toString() + "\n");
	}
}
