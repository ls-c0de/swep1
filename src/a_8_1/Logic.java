package a_8_1;

import inputTools.InputTools;

public class Logic {
	private static int oper;
	private static int op1;
	private static int op2;
	
	public static int readOperand(int opNr) {
		switch (opNr) {
		case 1:
			int oop1 = InputTools.readInteger("Zahl 1:");
			return op1 = oop1;
		case 2:
			int oop2 = InputTools.readInteger("Zahl 2:");
			return op2 = oop2;
		case '+':
			
		case '-':
//		default:
//			System.out.println("1 oder 2");
		}
		System.out.println("Aktuelle Operanden: " + op1 + " und " + op2);
		return oper;
	}
	
	public static void printOutput(int op1, int op2, char op, int res) {
		System.out.println(""+ op1 +" " +op +" " +op2 +" =" +res); 
	}
	
	public static void eingabe() {
		String eing = InputTools.readString("");
//		try {
//			Integer.parseInt(eing);
//		} 
//		catch () {
//			
//		} 
//		finally {
//			
//		}
	}
	
	public static void opWaehlen(String eing) {
		String [] ar = new String[6];
		ar[1] = "+";
		ar[2] = "-";
		
		if (eing.equals(ar[1])) {
			System.out.println("+");
		} else if(eing.equals(ar[2])) {
			System.out.println("-");
		} else
			System.out.println("Falsch");
	}
}
	

