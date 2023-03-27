package number_programs;

public class FactorialOfGivenNumber {

	public static void main(String[] args) {
		for (int j = 1; j <= 10; j++) {
			int input = j;
			int product = 1;
			for (int i = 1; i <= input; i++) {
				product = product * i;
			}

			System.out.println("factorial of " + input + " = " + product);
		}
	}
}
