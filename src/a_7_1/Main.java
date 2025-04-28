package a_7_1;

import inputTools.InputTools;

public class Main {
	public static void erzeugen(int z1, int z2, int z3) {		
		int [] ar = new int[3];
		int i = 0;
		
		//while(i < 3) {
			ar[0] = z3; //InputTools.readInteger("Zahl eingeben: ");
			ar[1] = z2;
			ar[2] = z1;
			i++;
		//}
		
		i = 0;
		boolean a = ar[0] != 0; // 0 = false, alles andere = true
		boolean b = ar[1] != 0;
		boolean c = ar[2] != 0;
		
		if ( ( a == true && ((b == true && c == true) || (b == false && c == false)) )
			|| (a == false && b != c) ) {
			System.out.print(1);
		} else {
		System.out.print(0);	
		}
		
	}
}
//|| (b == false && c ==false)) 
//|| a == false && b != c