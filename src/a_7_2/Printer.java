package a_7_2;

public class Printer {
	public static void main(String[] args) {
		int i = 0;
		int stelle = 0;
		int stelle2 = 0;
		int s3 = 0;
		
		
		
		while (i < 2) {
			for (int j = 0; j < 2; j++) {
				
				//System.out.print("    " +j);
				if (stelle == 1) {
					System.out.print(stelle + "0");
					
				} else {
				System.out.print(stelle);
					stelle++;
				}
				//System.out.print(stelle);
			}
			
			System.out.print("\n");
			++i;
		}
		
		
		
	}

}
