package a_10_1;

import java.math.BigInteger;

public class Formeln {
	public static void main(String[] args) {
		int num = 19; //f
		
		
		System.out.println(gWhile(num));
		System.out.println(fIter(num));
		System.out.println(fReku(num));
		System.out.println(gIter(num));
		System.out.println(gReku(num));
		System.out.println(gV2(num));
	}

	public static int fIter(int n) {
		int erg = 0; //neutrales element bei addition = 0
		for (int i = 3; i <= n; i++) {
			erg += (i * i * i) - (i * i) + i;
		}
		return erg;
	}
	
	public static int fReku(int n) { // funktion ruft sich selber auf
		if (n < 3) { // Abbruchbedingung
			return 0; //erg geht genauso
		} else {
			return ((n * n * n) - (n * n) + n) + fReku(n - 1); // Methodenaufruf
		} //ternärer ausdruck auch möglich

	}

	public static double gIter(int zahl) {
		double erg = 1.0;
		for (int i = 1;i <= zahl;i++) { // <= oder == oder <
			erg *= (double) i/(i+1);
			//System.out.println(erg);
		}
		return erg;
	}
	
	public static double gReku(int zahl) {
		if (zahl < 1) {
			return 1.0;
		} else {
			return (double) zahl/(zahl+1) * gReku(zahl-1);
		}	
	}
	
	public static double gWhile(int zahl) {
		double erg = 1.0;
		while(zahl >= 1) { // oder 0 < //bei int kein problem, bei double schon
			erg *= (double) zahl/(zahl+1);
			zahl--;
		}
		return erg;
	}
	
	public static double gV2(int zahl) {
		return 1.0/(zahl+1);
	}

	
}
