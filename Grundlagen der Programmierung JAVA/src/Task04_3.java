public class Task04_3 {

	int[] array;

	public Task04_3(int[] array) {
		this.array = array;
	}

	public double avgTemp(int[] array) {

		double x = 0;

		for (int i = 0; i < array.length; i++) {
			x += (double) array[i];
		}
		return x = x / array.length;
	}

	public int maxTemp(int[] array) {

		int x = array[0];

		for (int i = 1; i < array.length;i++) {
			if (x <= array[i]) {
				x = array[i];
			}
		}

		return x;
	}
	
	public int maxDiff(int[] array) {
		
		int diff = 0;
				
		for(int pre=0, j=1; pre<array.length-1 && j<array.length; pre++, j++){
			if(diff <= (array[pre] - array[j])) {
				diff = array[pre] - array[j];
			}
		}
		
		return diff;
	}
}
