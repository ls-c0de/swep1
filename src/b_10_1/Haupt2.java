package b_10_1;

import inputTools.InputTools;

public class Haupt2 {
	public static void main(String[] args) {
		
		int n = InputTools.readInteger("Wie viele Pruefungen sollen angelegt werden: ");
		Pruefung[] arr = new Pruefung[n]; //Mit Array list kann man sich das sparen
		
		for(int i = 0;i< arr.length;i++) { //n pruefungen einlesen
			String a = InputTools.readString("\nLehrveranstaltung angeben: ");
			int b = InputTools.readInteger("Credits angeben: ");
			double c = InputTools.readDouble("Note angeben: ");
			
			arr[i] = new Pruefung(a, b, c);
		}
		
		Pruefung2.sortieren();
		
		Pruefung p1 = new Pruefung("WIN", 1 , 2.7);
		Pruefung p2 = new Pruefung("GdIT", 1 , 3.7);
		Pruefung p3 = new Pruefung("BWL", 1 , 4.7);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		
		//System.out.println(arr[0].toString());
		try {
			int i = 0;
			while (i != n) {
				System.out.println(arr[i].toString());
				i++;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		
		
	}
}
