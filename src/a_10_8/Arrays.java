package a_10_8;

import a_10_9.MyRandom;
import inputTools.InputTools;

public class Arrays {
	private static int dim1; //tiefe
	private static int dim2; //breite

	public static void main(String[] args) {
		dim1 = InputTools.readInteger("Tiefe des Designs: ");
		dim2 = InputTools.readInteger("Breite des Designs : ");

		int[][] arr = new int[dim1][dim2];
		// int[][] arr = MyRandom.genArrFilled(dim1, dim2, 2);
		// fillArraySchachbrett(arr);
		// fillArrayZaehlen(arr);
		fillArrayStufe2(arr);
		ausgabe2D(arr);
		// System.out.println(6 / 2);
	}

	public static void ausgabe2D(int[][] arr) {
		for (int j = 0; j < dim1; j++) {
			for (int i = 0; i < dim2; i++) {
				System.out.printf("%1$3d", arr[j][i]);
			}
			// if (j + 2 != dim2) {
			System.out.println();
			// }
		}
	}

	public static int[][] fillArraySchachbrett(int[][] arr) {
		for (int j = 0; j < dim1; j++) { // Bewegen in der dim1
			for (int i = 0; i < dim2; i++) { // bewegen in der dim2
				if (j % 2 != 0) { // ist die dim1 eine grade dimension oder nicht
					if (i % 2 != 0) { // wenn nicht, dann mache alle ungerade zahlen 1
						arr[j][i] = 1;
					}
				} else {
					if (i % 2 == 0) { // andernfalls mache alle geraden zahlen 1
						arr[j][i] = 1;
					}
				}

			}
		}
		return arr;
	}

	public static int[][] fillArrayZaehlen(int[][] arr) {
		int count = 1;
		for (int j = 0; j < dim1; j++) { // Bewegen in der dim1
			for (int i = 0; i < dim2; i++) { // bewegen in der dim2
				arr[j][i] = count;
				count++;
			}
		}
		return arr;
	}

	public static int[][] fillArrayLinie(int[][] arr) {
		int count = 0;
		for (int j = 0; j < dim1; j++) {
//			while ()
//				y = count
//				x + y;
//				x-y 	
			for (int i = 0; i < dim2; i++) {
				arr[j][(dim2 / 2)] = 1 + count;
			}
			count++;
		}
		return arr;
	}

	public static int[][] fillArrayStufe(int[][] arr) { // first try ezz
		int total = 0;
		for (int j = 0; j < dim1; j++) {
			for (int i = 0; (i + total) < dim2; i++) {
				arr[j][i + total] = 1;
			}
			total++;
		}
		return arr;
	}

	public static int[][] fillArrayHalbe(int[][] arr) {
		int total = 0;
		for (int j = 0; j < dim1; j++) {
			for (int i = 0; (i + total) < dim2; i++) {
				arr[j][i + total] = 1;
			}
			total++;
			if (j == (dim2 / 2)) {
				break;
			}
		}
		return arr;
	}

	public static int[][] fillArrayStufe2(int[][] arr) {
		int total = 0;
		int j = 0;
		while (total < dim2) { //breite
			for(int i = (dim1);i > (dim1/2);i--) { //tiefe
				arr[total][i-total] = 1;
			}
			for (int i = 0;i < (dim1/2);i++) {
				arr[total][i+total] = 1;
			}
			total++;
		}
		return arr;
	}
}
