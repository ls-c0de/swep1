package b_7_1;

import inputTools.InputTools;

public class Test {
	
	public static void main(String[] args) {
		boolean konsistent = false;
		int z1;
		
		while (konsistent == false) {
			z1 = InputTools.readInteger("1 eingeben: ");
			if (z1 == 1) {
				konsistent = true;
			} else {
				System.out.println("Falsche eingabe");
			}
			
			String [] arr = {"Januar","Februar","Maerz", "April","Mai", "Juni", "Juli", "August", "September", "Oktober", "November", "Dezember" };
			
			System.out.println(arr[3]);
		}		
	}

}
