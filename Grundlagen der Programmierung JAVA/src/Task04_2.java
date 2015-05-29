
public class Task04_2 {

	public void schaltjahr() {
		int[] jahre = {1800, 1900, 1950, 1969, 1990, 2000, 2001, 2002, 2010, 2011, 2012, 2013, 2014};
		
		for(int i=0; i<jahre.length;i++) {
			int j = jahre[i];
			System.out.print("Das Jahr " + j + " ist: ");
			if(j%400 == 0 || (j%100 != 0 && j%4 == 0)) {
				System.out.print("ein Schaltjahr.\n");
			} else {
				System.out.print("KEIN Schaltjahr.\n");
			}
		}
	}
}
