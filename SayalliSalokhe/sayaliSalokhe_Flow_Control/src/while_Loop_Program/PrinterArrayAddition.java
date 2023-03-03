package while_Loop_Program;

public class PrinterArrayAddition {
	public static void PrintArray(int[] array) {
		System.out.println("Before Increase");
		int i = 0;
		while (i < array.length) {
			System.out.println(array[i]);
			i++;
		}

	}

	public static void PrintIncreaseArray(int[] array) {

		System.out.println("After increase:");
		int index = 0;
		int result=0;
		while (index <array.length) {
			result = array[index] + 100;
			index++;
			System.out.println(result);

		}
		

	}

}
