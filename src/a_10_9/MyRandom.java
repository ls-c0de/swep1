package a_10_9;

import java.util.Random;

public class MyRandom {
	public static int genRand(int stellen) {
		Random rand = new Random();
		return rand.nextInt(stellen);
	}
	
	//this function returns a filled array
	public static int[][] genArrFilled(int dim1, int dim2, int biggestNum) {
		int[][] arr = new int[dim1][dim2];
		
		for(int j = 0;j < dim1;j++) {
			for (int i = 0;i < dim2;i++) {
				arr[j][i] = genRand(biggestNum);
			}
		}
		
		return arr;
	}

}
