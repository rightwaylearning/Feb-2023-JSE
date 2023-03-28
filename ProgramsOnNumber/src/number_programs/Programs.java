package number_programs;

public class Programs {

	public static void main(String[] args) {
		
		 // 5 >> 25, 1 >> 1  , 25 >> 625
		 // 6 >> 36,   10 >> 100
		
		int input = 24;
		int square = input * input;  // 625;
		
		int lastFewDigit = getLastFewDigit(square, getLength(input));
		
		if(input == lastFewDigit) {
			System.out.println("yes");
		}else {
			System.out.println("no");
		}
	}
		
	static int getLastFewDigit(int originalNumber, int length) {
		// 625
		String fetLastDigit = "";
		for (int i = 1; i <=length; i++) {
			int r = originalNumber % 10;
			fetLastDigit = r + fetLastDigit;
			originalNumber = originalNumber/10;
		}
		return Integer.parseInt(fetLastDigit);
	}
	
	static int getLength(int input) {
		int length =0 ;
		while(input > 0) {
			length++;
			input = input/10;
		}
		return length;
	}
}
