package for_loop;

public class WhieAndForLoop {
	public static void main(String[] args) {
		System.out.println("While loop");
		int[] array1 = { 10, 20, 30, 40, 50 };
		int index = 0;
		while (index < array1.length) {
			System.out.println(array1[index]);
			index++;
		}

		// =================================================
		System.out.println("For loop");
		int[] array = { 10, 20, 30, 40, 50 };

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
