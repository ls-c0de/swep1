package b_6_2;

public class Sparkonto extends Konto {

	public Sparkonto() {
		super();
	}
	public Sparkonto(int s, int nr) {
		super(s, nr);
	}
	
	public void auszahlen(int eingabe) {
		if (eingabe > getSaldo()) {
			System.out.println("Keine ausreichende Kontodeckung!");
		} else {
			int ausg = getSaldo() - eingabe;
		}
	}
	
	public String toString() {
		return "Ihr Sparkonto \n" +getSaldo() +"\n" +getKontonr();
	}
	
}
