package while_loop;

class ArrayExample {
	public static void printArray(int[] arr) {
		int index = 0;
		while (index < arr.length) {
			System.out.print(" " + arr[index]);
			index++;
		}

	}

	public static void printArray1(int[] arr) {
		int index = 0;
		while (index < arr.length) {
			System.out.print(" " + arr[index] * 10);
			index++;
		}

	}

}

public class WhileUsingArray {
	public static void main(String[] args) {
		int[] numArray = { 10, 20, 30, 40, 50 };

		ArrayExample.printArray(numArray); // 10 20 30 40 50
		System.out.println();

		System.out.println("**************************************************");

		numArray[2] = numArray[2] + 50;

		ArrayExample.printArray(numArray);// 10 20 80 40 50
		System.out.println();

		System.out.println("**************************************************");
		ArrayExample.printArray1(numArray); // 100 200 800 400 500

	}

}
