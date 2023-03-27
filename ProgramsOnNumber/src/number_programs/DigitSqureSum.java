package number_programs;

public class DigitSqureSum {

	public static void main(String[] args) {
		Integer num = 25;
		Integer result = 0;
		while (num > 0) {
			int r = num % 10;
			result = result + r*r;
			num = num / 10;
		}
		System.out.println(result);
	}
}
