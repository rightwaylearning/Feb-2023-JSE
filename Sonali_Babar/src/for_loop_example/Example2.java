package for_loop_example;

public class Example2 {
	public static void main(String[] args) {

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++) {
				System.out.print(" " + "(" + i + "," + j + ")");
			}
			System.out.println();
		}
		System.out.println("******************************");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)

			{
				if (i == j) {
					System.out.print(" " + "(" + i + "," + j + ")");
				}
			}

		}
		System.out.println();
		System.out.println("******************************");

		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)

			{
				if (i != j) {
					System.out.print(" " + "(" + i + "," + j + ")");
				}
			}System.out.println();

		}
		System.out.println();
		System.out.println("******************************");
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5; j++)

			{
				if (i != j) {
					System.out.print(" " + "(" + i + "," + j + ")");
					break;
				}
			}System.out.println();

		}
		System.out.println();
	}

}
