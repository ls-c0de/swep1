package b_11_3;

import inputTools.InputTools;

public class Zeichenkette2 {
	public static void main(String[] args) {
		StringBuilder sb1 = new StringBuilder();
		String s = InputTools.readString("Zu zaehlende Zeichenkette: ");
		sb1.append(s);
		
		System.out.println(sb1.toString());
		
		//Rest wie bei der anderen Zeichenkette
	}

}
