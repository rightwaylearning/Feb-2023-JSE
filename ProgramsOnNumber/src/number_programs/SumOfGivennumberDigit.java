package number_programs;

public class SumOfGivennumberDigit {

	public static void main(String[] args) {
		
		int num = 34867;  // 25 // even = 18 odd =10
		int even = 0;
		int odd =0;
		while(num > 0) {
			int r = num%10; 
			if(r%2 == 0) {
				even = even + r;
			}else{
				odd =odd + r;
			}
			
			num = num  /10;
		}
		
		System.out.println(even);
		System.out.println(odd);
	}
}
