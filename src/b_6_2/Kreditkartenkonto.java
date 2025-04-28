package b_6_2;

public class Kreditkartenkonto extends Konto {

	public Kreditkartenkonto() {
		super();
	}
	public Kreditkartenkonto(int s, int nr) {
		super();
		setSaldo(s);
		setKontonr(nr); 
	}
	
	public String toString() {
		return "Ihr Kreditkartenkonto \n" +getSaldo() +"\n" +getKontonr();
	}
}
