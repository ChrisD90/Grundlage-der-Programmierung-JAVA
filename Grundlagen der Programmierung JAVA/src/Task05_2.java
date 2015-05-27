
public class Task05_2 {

	public void fibo() {
		int[] fibo = new int[30];
		fibo[0]=1;
		fibo[1]=1;
		
		System.out.print(fibo[0]+";");
		System.out.print(fibo[1]+";");
		
		for(int i = 2; i <fibo.length; i++) {
			fibo[i] = fibo[i-2] + fibo[i-1];
			System.out.print(fibo[i]+";");
		}
	}
	
}
