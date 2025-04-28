package a_7_2;

public class Test2 {
	public static void main(String[] args) {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		int i = 0;
		
		while (i < 5) {

//			System.out.print(s3);
//			System.out.print(s2);
//			System.out.print(s1);
			
			if (s1 == 1) {
				s2++;
			} else if (s2 == 1 && s1 == 1) {
				s3++;
				System.out.print("Fall 1");
			} else if (s1 == 1 && s2 == 1) {
				s2++;
			} else if (s1 == 1 && s2 == 1 && s3 ==1){
				System.out.println("ENDE");
				return;
			}

			System.out.print(s1);
			System.out.print(s2);
			System.out.print(s3);
			System.out.print("\n");
			
			s1++;
			i++;
		}
	}
}
