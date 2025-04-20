package b_8_1;

public class Figur {

	private int referenzpunkt_x;
	private int referenzpunkt_y;
	
	public int getReferenzpunkt_x() {
		return referenzpunkt_x;
	}
	public void setReferenzpunkt_x(int referenzpunkt_x) {
		this.referenzpunkt_x = referenzpunkt_x;
	}
	
	public int getReferenzpunkt_y() {
		return referenzpunkt_y;
	}
	public void setReferenzpunkt_y(int referenzpunkt_y) {
		this.referenzpunkt_y = referenzpunkt_y;
	}
	
	public String toString() {
		return "Rechteck: " +"x: "+getReferenzpunkt_x() +" y: " +getReferenzpunkt_y();
	}
}
