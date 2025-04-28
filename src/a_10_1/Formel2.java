package a_10_1;

import java.math.BigDecimal;

public class Formel2 {
	public static double gIter(String zahl) {
		bd = new BigDecimal(zahl);
		double erg = 1;
		double x = Double.parseDouble(zahl);
		
		for (double i = 1.0;i <= x;i++) { // <= oder == oder <
			erg *= (i/(i+1.0));
			//System.out.println(erg);
			
			//bd = bd.multiply(bd.divide());
		}
		return erg;
	}
	public static BigDecimal bd;

}
