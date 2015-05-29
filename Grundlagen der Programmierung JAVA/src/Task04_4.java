public class Task04_4 {

	public static void printMatrix(int[][] matrix) {

		//printing
		System.out.println("Original Matrix:");
		showOnConsole(matrix);

		// changing Value
		matrix[1][1] = 0;
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {
				if (!(i == 1 && j == 1)) {
					matrix[1][1] += matrix[i][j];
				}

			}
		}

		System.out.print("\n");
		
		//printing
		System.out.println("Modified Matrix I:");
		showOnConsole(matrix);
		
		matrix[1][0] -= 5;

		System.out.print("\n");

		//printing
		System.out.println("Modified Matrix II:");
		showOnConsole(matrix);
		
	}

	/**
	 * @param matrix
	 */
	private static void showOnConsole(int[][] matrix) {
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 2; j++) {
				if (j != 1) {
					System.out.print(matrix[i][j] + "\t");
				} else {
					System.out.println(matrix[i][j]);
				}

			}
		}
	}

	public static void main(String args[]) {
		int[][] matrix = new int[3][2];

		matrix[0][0] = 2;
		matrix[0][1] = 3;
		matrix[1][0] = 21;
		matrix[1][1] = 42;
		matrix[2][0] = 0;
		matrix[2][1] = 1;

		printMatrix(matrix);
	}

}
