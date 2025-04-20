package a_10_3;

import java.util.Formatter;

public class JugendForscht {
	public static void main(String[] args) {
		int x = 6;
		System.out.println(new Formatter().format("KW %d / %4d", x, 2012, 3001, 501));
		
		for (String u: "Hallo liebe SWEP-Studenten".split(" ")) 
			System.out.println(u);
		
		double y = 3.4;
		System.out.println(Double.toHexString(y));
		
		Math.sin(y);
		
	}
}
