package b_11_4;

public class Main {
	public static void main(String[] args) {
		Punkt p1 = new Punkt(1, 2);
		Punkt p2 = new Punkt(4, 3);

		System.out.println(p1.abstandZu(p2));
		
		//3,1622776602 kam online raus
		//3.1622776601683795 kommt bei mir raus
	}
}
