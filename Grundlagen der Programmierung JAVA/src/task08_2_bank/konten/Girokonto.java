package task08_2_bank.konten;

public class Girokonto extends Konto {

	double dispoLimit;
	
	public Girokonto(String inhaber, int nr, double dispoLimit) {
		super(inhaber, nr);
		this.dispoLimit = dispoLimit;
		
	}
	
	public boolean auszahlen(double value) {
		
		boolean bool;

		if (value >= 0 && this.kontostand-value >= dispoLimit) {
			this.kontostand -= value;
			bool = true;
		} else {
			bool = false;
		}

		return bool;
		
	}

}
