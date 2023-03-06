package for_loop_example;

public class Example1 {
	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < arr.length; i++) {
			System.out.print(" " + arr[i]);
		}
		System.out.println();
		System.out.println("*****************************");

		int[] arr1 = { 10, 20, 30, 40, 50 };
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];

		}
		System.out.println("Sum of Array Element " + sum);
		System.out.println();
		System.out.println("*****************************");

		int[] arr2 = { 10, 20, 30, 40, 50 };
		int num = 40;
		for (int i = 0; i < arr.length; i++) {

			if (arr2[i] == num) {
				System.out.println("Number is Present At Index  " + i);

			} else {
				System.out.println("Number is not Present");
			}
		}
		System.out.println();
		System.out.println("*****************************");
		
		int[] arr3 = { 10, 20, 30, 40, 50 };
		int num1 = 40;
		for (int i = 0; i < arr.length; i++) {

			if (arr3[i] == num1) {
				System.out.println("Number is Present At Index  " + i);
				break;

			} else {
				System.out.println("Number is not Present");
			}
		}
		System.out.println();

	}

}
