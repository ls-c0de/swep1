package b_6_2;

import inputTools.InputTools;

public class Konto {

	private int kontonr;
	private int saldo;
	
	public Konto() {
	}
	public Konto(int s, int nr) {
		saldo = s;
		kontonr = nr;
	}

	public String toString() {
		return "Konto : \n" +kontonr + saldo;
	}
	
	
	public void auszahlen(int eingabe) {
		saldo -= eingabe;
	}
	public void einzahlen(int einzahlung) { 
		saldo += einzahlung; //Andere Möglichkeit wäre mit dem Setter
	}
	
	public int getSaldo() { //getter
		return saldo;
	}
	public int getKontonr() {
		return kontonr;
	}
	
	public void setSaldo(int s) { //setter
		saldo = s;
	}

	public void setKontonr(int ko) {
		while (true) {
			if (10000 <= ko && ko <= 99999) {
				kontonr = ko;
				return;
			} else {
				ko = InputTools.readInteger("Kontonummer muss 5-Stellig sein: ");
				//System.out.println("Kontonummer muss 5stellig sein!");
				continue;
			}
			
		}
	}
	
	
}
