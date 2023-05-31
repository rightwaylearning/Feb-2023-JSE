package exception_handlingbasic.examples;

public class ExceptionHandling {

	public static void main(String[] args) {

		System.out.println("I am start point");
		Integer[] arr = { 10, 20, 30, 40, 50, 60, 70, 80 }; // 0-7

		System.out.println(arr[0]);
		System.out.println(arr[3]);

		try {
			System.out.println(arr[6]);
			System.out.println(arr[2]);
			System.out.println(arr[10]);
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		System.out.println(arr[7]);
		System.out.println("I am end point");
	}
}
