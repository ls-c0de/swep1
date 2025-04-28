package a_8_2;

import java.lang.reflect.Array;
import java.util.Arrays;

import inputTools.InputTools;

public class Program {
	public static void main(String[] args) {
		int[] ar = new int[3];
		boolean konsistent = true;

		for (int i = 0; i < 3; i++) {
			ar[i] = InputTools.readInteger("Zahl eingeben: ");
		}
		while (true) {
			if (ar[0] < ar[1] && ar[1] < ar[2]) {
				System.out.println(Arrays.toString(ar));
				return;
			} else {
				for (int n= 0; n < (Array.getLength(ar)-1);n++) {
					if (ar[n] > ar[n + 1]) { // S1 ist größer als S2
						int k = ar[n];
				        ar[n] = ar[n+1];
				        ar[n+1] = k; 
					} else {
						konsistent = false;
					}
				}
			}
		}
	}

}
