package b_8_1;

public class Haupt {
	public static void main (String[] args) {
		Rechteck eck = new Rechteck(2, 3, 4, 5);
		//generalisierung, wenn man aus zwei Klassen eine Super macht
		//gegenteil: spezialisierung

		System.out.println(eck);
		Rechteck eck2 = new Rechteck(3, 2, 5, 4);
		System.out.println(eck2);
	}

}
