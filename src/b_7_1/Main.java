package b_7_1;

import inputTools.InputTools;

public class Main {
	public static void main(String[] args) {

//		int pAnzahl = InputTools.readInteger("Wie viele Personen möchten sie erstellen?");
//		for (int j = 0; j < pAnzahl; j++) {
//		Person per2 = new Person("Thomas", 32, 13, 1877);
//		System.out.print(per2.toString());
		
			String a1 = InputTools.readString("Name eingeben: ");
			int a2 = InputTools.readInteger("Geburtstag eingeben: ");
			int a3 = InputTools.readInteger("Geburtsmonat eingeben: ");
			int a4 = InputTools.readInteger("Geburtsjahr eingeben: ");
//			
////			String s = "p"+ j++;
////			int p = Integer.parseInt(s);
////			System.out.println(p);
//			
			Person per1 = new Person(a1, a2 ,a3, a4);
			Person per2 = new Person("Heinz", 12, 3, 1997);
			System.out.println(per1.toString());
			System.out.println(per2.toString());
			
			int yyyy = InputTools.readInteger("Aktuelles Jahr eingeben: ");
			System.out.println("Alter von " +per1.getName() +": " +per1.alter(yyyy));
			System.out.println("Alter von " +per2.getName() +": " +per2.alter(yyyy));
			
//			String b3 = AktuellesDatum.abfragen();
//			System.out.println(b3);
			
			//int aj = InputTools.readInteger("Aktuelles Jahr: ");
			
	}
}
