package b_8_1;

public class Rechteck extends Figur {
	private int hoehe;
	private int breite; // ohne private, package sichtbar
	
	public Rechteck(int ref_x, int ref_y, int br, int ho) {
		setReferenzpunkt_x(ref_x);
		setReferenzpunkt_y(ref_y);
		setBreite(br);
		setHoehe(ho);
	}
	
	public int getHoehe() {
		return hoehe;
	}
	public void setHoehe(int hoehe) {
		this.hoehe = hoehe;
	}
	public int getBreite() {
		return breite;
	}
	public void setBreite(int breite) {
		this.breite = breite;
	}
	
	public String toString() {
		return super.toString() + //Tostring von superklasse
		"\nBreite: " +getBreite() +" Hoehe: "+getHoehe();
	}
}
