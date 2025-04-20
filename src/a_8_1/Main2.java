package a_8_1;

import inputTools.InputTools;

public class Main2 {
	
	public static void main(String[] args) {
		int op1 = 0;
		int op2 = 0;
		boolean konsistent = true;
		
		System.out.println("Kleiner Rechner");
		while (konsistent) {
			System.out.println("Aktuelle Operanden: " + op1 + " und " + op2);
			String eing = InputTools.readString("Operatoren (+-*/&|^), Operanden (1, 2) oder Ende (0)? ");
			if (eing.length() == 1) { //Fehlervermeidung vor Fehlerreaktion (try...catch)
				switch (eing.charAt(0)) {
				case '0': 
					konsistent = false; //Eigentlich unnötig, weil user hat ja 0 gedrückt (2 Informationen)
					System.out.println("Ende");
					break;
				case '1':
					op1 = readOperand(1);
					break;
				case '2':
					op2 = readOperand(2);
					break;
				case '+':
					printOutput(op1, op2, '+', (op1+op2));
					break;
				case '-':
					printOutput(op1, op2, '-', (op1-op2));
					break;
				case '*':
					printOutput(op1, op2, '*', (op1*op2));
					break;
				case '/':
					if (op2 != 0) {
						printOutput(op1, op2, '/', (op1/op2));
					} else {
						System.out.println("Darf nicht Null sein! ");
					}
					break;
				case '&':
					printOutput(op1, op2, '&', (op1&op2));
					break;
				case '|':
					printOutput(op1, op2, '|', (op1|op2));
					break;
				case '^':
					printOutput(op1, op2, '^', (op1^op2)); //parameter werden ausgewertet
					//bevor die Methode ausgeführt wird
					break;					
				default:
					System.out.println("Ungueltiges Zeichen \n");
				}		
			} else {
				System.out.println("Eingabe nicht 1 Zeichen lang \n");
			} //While schleife prüft am Kopf, do while am Fuß
		}
	}
	
	static int readOperand(int opNr) { //kein public oder privat, signatur beachten!
		int eing = InputTools.readInteger("Zahl " + opNr +": ");
		return eing;
	}
	
	
	static void printOutput(int op1, int op2, char op, int res) {
		System.out.println(""+ op1 +" " +op +" " +op2 +" = " +res); 
	}

}
