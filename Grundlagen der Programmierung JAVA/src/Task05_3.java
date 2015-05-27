public class Task05_3 {

	public boolean istSchaltjahr(int jahr) {

		if (jahr % 4 == 0 && (jahr % 100 != 0 || jahr % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void run(int jahr) {
		 boolean bool = istSchaltjahr(jahr);
		 
		 if(bool) {
			 System.out.println("Das Jahr "+ jahr + " ist ein Schaltjahr!");
		 } else {
			 System.out.println("Das Jahr "+ jahr + " ist KEIN Schaltjahr!");
		 }
	}

}
