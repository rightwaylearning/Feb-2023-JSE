package array_Assingment;

public class SumOfArray {
	public static void main(String[] args) {
		int[] array = { 12, 4, 5, 77, 99 };
		int sum = 0;
		int index = 0;

		while (index < array.length) {
			sum = sum + array[index];
			index++;
		}
		System.out.println("Sum of array:" + sum);

	}

}
