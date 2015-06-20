package task07_4;

public class Konto {

	public int kontonummer;
	public double kontostand = 0;

	public Konto(int nr) {
		kontonummer = nr;
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

}
