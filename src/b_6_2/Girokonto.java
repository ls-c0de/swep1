package b_6_2;

public class Girokonto extends Konto {
	
	public Girokonto() {
		super();
	}
	
	public Girokonto(int s, int nr) {
		super(s, nr);
		
	}
	
	public String toString() {
		return "Ihr Girokonto \n" +getSaldo() +"\n" +getKontonr();
	}
}
