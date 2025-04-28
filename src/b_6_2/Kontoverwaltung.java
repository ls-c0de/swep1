package b_6_2;

import inputTools.InputTools;

public class Kontoverwaltung {
	public static void main(String[] args) {
		Kreditkartenkonto k = new Kreditkartenkonto(); //Konto oder Kreditkartenkonto?
		k.setSaldo(InputTools.readInteger("Saldo von k angeben: "));
		k.setKontonr(InputTools.readInteger("Kontonr von k angeben: "));
		System.out.println(k);
		
		int e1 = InputTools.readInteger("Saldo von g angeben: ");
		int e2 = InputTools.readInteger("Kontonr von g angeben: ");
		Girokonto g = new Girokonto(e1, e2);
		System.out.println(g);
	
		//ueberweisen
		int b = InputTools.readInteger("Wieviel moechten sie ueberweisen von g an k?: ");
		
		g.setSaldo((g.getSaldo()) - b); 
		k.setSaldo((k.getSaldo()) + b);
		
		System.out.println(k +"\n" +g);
		//System.out.println(g);
	}
	
}
