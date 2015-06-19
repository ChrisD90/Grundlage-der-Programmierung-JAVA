package task06;

public class Kontoverwaltung {

	public static void main(String[] args) {

		Konto[] konten = new Konto[10];
		for (int i = 0; i < konten.length; i++) {
			Konto k = new Konto(i+1);
			konten[i] = k;
			System.out.println(konten[i].kontonummer + "    " + konten[i].kontostand);
		}
		
		konten[4].einzahlen(500);
		konten[2].einzahlen(-5);
		konten[3].einzahlen(46.5);
		konten[8].auszahlen(5.6);
		konten[4].auszahlen(42);
		konten[2].einzahlen(4.33);
		
		for (int i = 0; i < konten.length; i++) {
			System.out.println(konten[i].kontonummer + "    " + konten[i].kontostand);
		}
	}
	
	

}
