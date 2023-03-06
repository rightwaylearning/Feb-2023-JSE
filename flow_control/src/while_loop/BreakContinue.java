package while_loop;

public class BreakContinue {

	public static void main(String[] args) {

		// break
		for (int i = 1; i < 4; i++) {

			for (int j = 1; j < 4; j++) {

				if (i == j) {
					System.out.println("(" + i + " " + j + ")"); // (1 , 1)
				} else
					break; // for inner loop

			}
			break;// for outside loop

		}
		System.out.println("/////////////////////////////////////////");
		// continue

		for (int i = 0; i < 10; i++) {

			for (int j = 0; j < 10; j++) {
				if (i == j) {
					System.out.println("(" + i + " " + j + ")");
				} else
					continue;
			}
		}
		System.out.println("/////////////////////////////////////////");
		for (int i = 0; i < 5; i++) {

			for (int j = 0; j < 5; j++) {
				if (i != j) {
					System.out.println("(" + i + " " + j + ")");
				} else
					continue;
			} // break;- run only one time (e.g 0 )
		}
	}

}
