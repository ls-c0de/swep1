package a_8_2;

import java.util.Arrays;

import inputTools.InputTools;

public class Tausch {
	public static void main(String[] args) {
		int[] ar = new int[2];
		boolean konsistent = true;
		int n = 0;
		
		for (int i = 0; i < 2; i++) {
			ar[i] = InputTools.readInteger("Zahl eingeben: ");
		}

		int k = ar[0];
        ar[0] = ar[1];
        ar[1] = k; 
		
		System.out.println(Arrays.toString(ar));
		
	}
}
