package a_8_2;

import inputTools.InputTools;

public class Program2 {
	public static void main(String[] args) {
		int a = 0, b = 0, c = 0;

		a = InputTools.readInteger("a: ");
		b = InputTools.readInteger("b: ");
		c = InputTools.readInteger("c: ");

		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println(a +"<" +b +"<" +c);
	}
	

}
