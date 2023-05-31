package exception_handlingbasic.examples;

public class TryCatchFlow {

	public static void main(String[] args) {

		System.out.println("1");
		try {
			System.out.println("2");
			System.out.println("3");
			System.out.println("4");
			System.out.println("5");
			int op =100/0;
		} catch (Exception e) {
			try {
				int j = 10 / 0;
			} catch (NumberFormatException e1) {
				System.out.println("**");
			}
			System.out.println("6");
		}

		System.out.println("7");
	}
}
