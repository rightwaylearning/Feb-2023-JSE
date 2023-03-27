package number_programs;

public class reverseGivenNumber {

	public static void main(String[] args) {
		Integer num = 98546;
		Integer result = 0;
		while(num > 0) {
			int r = num % 10;
		    result = result*10 + r;
			num = num/10;
		}
		System.out.println(result);
	}
}
