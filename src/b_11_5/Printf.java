package b_11_5;

public class Printf {
	public static void main(String[] args) {
		// create array with 10x10 fields
		int[][] arr = new int[11][11]; // we dont need that

		
		System.out.println("\nDas kleine Einmaleins");
		// fill the array
		for (int j = 1; j < 11; j++) { 
			for (int i = 1;i < 11;i++) {
				arr[j][i] = i * j;
				System.out.printf("%1$4d", arr[j][i]);
			}
			System.out.println();
		}
		
		
	}

}
