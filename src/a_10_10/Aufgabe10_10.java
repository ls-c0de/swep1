package a_10_10;

public class Aufgabe10_10 {
	public static void main(String[] args) {
		int[][] data = { { 1, 2, 3, 4, 5, 11, 12, 13 }, { 6 }, { 7 }, { 8, 9, 1, 2, 3, 4, 12, 17, 21, 44 } };

		double mittel = 0.0;
		int summe = 0;
		int counter = 0;
		
//		for (int i = 0;i < data.length;i++) {
//			for (int j = 0;j < data[i].length;j++) {
//				summe += data[i][j];
//				counter++;
//			}
//		}
//		mittel = (double) summe / counter;
//		
//		for (int i = 0;i < data.length;i++) {
//			for (int j = 0;j < data[i].length;j++) {
//				if (data[i][j] > mittel) {
//					System.out.print(data[i][j] + " ");
//				}
//			}
//			System.out.println();
//		}
//		System.out.println("Das Mittel beträgt: " +mittel);
		
		for (int[] arr : data) {
			for (int y : arr) {
				summe += y;
				counter++;
			}
		}
		mittel = (double) summe / counter;
		for (int[] arr : data) {
			for (int x : arr) {
				if (x > mittel) {
					System.out.print(x + " ");
				}
			} 
			System.out.println();
		}
		
	}
	
	

}
