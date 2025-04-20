package a_7_2;

public class Test {
	public static void main(String[] args) {
		int s1,s2,s3;
		
		for (int i = 0; i < 5; i++) {
			
			s1 = 0;
			s2 = 0;
			s3 = 0;
									//true and false
			s3 = s2 == 1 && s1 == 1 ? s3 = 0 : ++s3;
			
			System.out.print(s1);
			System.out.print(s2);
			System.out.println(s3);
			
			s1 = i;
		}
		
		
		
//		s1 = 0;
//		s2 = 0;
//		s3 = 0;
//		
//		
////		s1 = s1 == 1 ? s1 : ++s1;
//		
//		s2 = s1 == 1 && s2 == 1 ? s2 : ++s3;
//		s1 = s1 == 1 ? s1 : ++s1;
//		
//		System.out.print(s3);
//		System.out.print(s2);
//		System.out.print(s1);
		
	}
}

// Die for-Schleife ist eine Struktur, 
//die dazu dient, eine oder mehrere Anweisungen solange wiederholt auszuführen,
//wie eine Bedingung wahr (true) ist. 

//int count = isHere ? getHereCount(index) : getAwayCount(index);