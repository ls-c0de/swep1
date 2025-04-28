package a_10_9;

public class Datensuche {
	public static void main(String[] args) {
		// int x = 5; // Array length
		// int[][] data = new int[MyRandom.genRand(x)][MyRandom.genRand(x)];
		// int[][] data = MyRandom.genArrFilled(2, 6, 100);
		int[][] data = { { 1, 2, 3, 4, 5, 11, 12, 13 }, { 6 }, { 7 }, { 8, 9, 1, 2, 3, 4, 12, 17, 21, 44 } };
		// int[][] arr = new int[5][0];
		for (int[] y: data) {
			for (int x : y) {
				if((x % 2) == 0) {
					System.out.print(x +" ");
				}
			}
			System.out.println();
		} //i, j , k ,l
		
//		for (int i = 0; i < data.length; i++) {
//			for (int j = 0; j < data[i].length; j++) {
//				if ((data[i][j] % 2) == 0) {
//					System.out.print(data[i][j] + " ");
//				}
//			}
//			System.out.println();
//		}
		System.out.println("Ende");
	}

}
