package task08_2_bank.konten;

public class Konto {

	String inhaber;
	int kontonummer;
	double kontostand = 0;

	public Konto(String inhaber, int nr) {
		kontonummer = nr;
		this.inhaber = inhaber;
	}

	public boolean einzahlen(double value) {

		boolean bool;

		if (value >= 0) {
			kontostand += value;
			bool = true;
		} else {
			bool = false;
		}
		return bool;
	}

	public boolean auszahlen(double value) {

		boolean bool;

		if (value >= 0 && value <= kontostand) {
			kontostand -= value;
			bool = true;
		} else {
			bool = false;
		}

		return bool;
	}
	
	public void druckeKontoauszug() {
		System.out.println(inhaber + " - KtNr.: "+kontonummer+ " - Saldo: "+ kontostand);
	}

}
