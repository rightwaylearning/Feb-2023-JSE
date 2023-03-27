package number_programs;

public class PrintGivenNumberDigit {

	public static void main(String[] args) {
		
		int input = 123;
		
		while(input > 0) {
			int r = input % 10;
			System.out.println(r);
			input =  input/10;
		}
	}
}
