package number_programs;

public class ArmstrongNumber {
	
	public static void main(String[] args) {
		// find out given number is armstrong number ??
		int  num = 153;
		int numCopy = num;
		int sum = 0;
		while(num > 0) {
			int r = num % 10;
			sum = sum + r*r*r;
			num = num/10;
		}
		
		if(numCopy== sum) {
			System.out.println("This is Armstrong Number");
		}else {
			System.out.println("sorry");
		}
	}

}
