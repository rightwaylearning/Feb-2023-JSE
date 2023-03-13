package use_of_break;

public class Case2 {
	
	public static void main(String[] args) {
		
		int[] arr1 = { 10, 20, 56, 4, 7, 8 };

		for (int i = 0; i < arr1.length; i++) {
			System.out.println(i);
			if (arr1[i] == 4) {
				System.out.println("no is present:" +arr1[i]);
				break;

			}

		}
	}

}
