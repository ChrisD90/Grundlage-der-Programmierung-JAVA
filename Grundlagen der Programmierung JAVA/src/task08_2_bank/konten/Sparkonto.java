package task08_2_bank.konten;

public class Sparkonto extends Konto{

	static double zinssatz = 0.006;
	
	public Sparkonto(String inhaber, int nr) {
		super(inhaber, nr);
		// TODO Auto-generated constructor stub
	}
	
	public void verzinsen() {
		this.kontostand = (this.kontostand * zinssatz) + this.kontostand;
	}

}
