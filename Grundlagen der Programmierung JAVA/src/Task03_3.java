
public class Task03_3 {

	int[] array ={1,2,3,4,5,6,7,8,9,10};
	
	public void quad() {
		for(int i = 0; i < array.length; i++) {
			array[i] = array[i] * array[i];
			System.out.print(array[i] + ";");
		}
	}
}
