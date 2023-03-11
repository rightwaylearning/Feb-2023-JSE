package two_d_arrays;

public class MaskDiagonalElementsOfMatrix {

	public static void main(String[] args) {

		int[][] arr = new int[3][3];

		// arr is reference type(int[][]) variable pointing to @D array , that @D array
		// contain 3 1D array of type (int[])
		// every 1 D array contain 4 int type value.
		// System.out.println(arr instanceof int[][]);

		arr[0][0] = 12;
		arr[0][1] = 11;
		arr[0][2] = 12;

		arr[1][0] = 11;
		arr[1][1] = 12;
		arr[1][2] = 13;

		arr[2][0] = 21;
		arr[2][1] = 22;
		arr[2][2] = 23;

		printArray(arr);

		System.out.println("=======================================");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				if (j == i) {
					arr[i][j] = 0;
				}
			}
		}
		
		printArray(arr);

	}

	static void printArray(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}

	}

}
