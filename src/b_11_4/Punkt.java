package b_11_4;

public class Punkt { //könnte man das mit static machen?
	public double x;
	public double y;
	
	Punkt(double x, double y) {
		this.x = x;
		this.y = y;
	}

	//Pythogars
	public double abstandZu(Punkt b) {
		double xVonB = b.x;
		double yVonB = b.y;
		
		double distanz = Math.hypot((xVonB - this.x), (yVonB - this.y));
		return distanz;
	}
	
	public String toString() {
		return "Der Punkt liegt an x:" +x +" und y:" +y;
	}
	
}
