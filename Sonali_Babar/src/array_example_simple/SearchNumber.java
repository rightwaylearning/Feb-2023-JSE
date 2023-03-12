package array_example_simple;

public class SearchNumber {

	public int arrayElement(int[] arr, int num) {

		for (int i = 0; i < arr.length; i++) {
			if (num == arr[i]) {
				System.out.println(num + " Number is Present at " + i + "th index");
				break;
			}
		}

		return 0;

	}

}
