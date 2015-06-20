package task08_2_bank;
import task08_2_bank.konten.*;

public class Bank {

	public static void main(String[] args) {

		Girokonto giro1 = new Girokonto("Christoph Döringer", 1, -100);
		Girokonto giro2 = new Girokonto("Angela Rettig", 2, -1500);
		Sparkonto spar1 = new Sparkonto("Hans Sparfuchs", 3);
		
		Konto[] konten = new Konto[100];
		konten[0] = giro1;
		konten[1] = giro2;
		konten[2] = spar1;
		
		//Transaktionen
		giro1.einzahlen(1000);
		giro1.druckeKontoauszug();
		giro1.auszahlen(1500);
		giro1.druckeKontoauszug();
		
		giro2.einzahlen(200);
		giro2.druckeKontoauszug();
		giro2.auszahlen(700);
		giro2.druckeKontoauszug();

		spar1.einzahlen(5000);
		spar1.druckeKontoauszug();
		spar1.verzinsen();
		spar1.druckeKontoauszug();
	}

}
