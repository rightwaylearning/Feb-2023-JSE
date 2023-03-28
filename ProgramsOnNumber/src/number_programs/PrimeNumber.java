package number_programs;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 11;
		boolean flag = true;
		
		for(int i = 2 ; i <=num-1 ; i++) {
		     if(num%i == 0) {
		    	 flag =false;
		    	 break;
		     }	
		}
		if(flag) {
			System.out.println("Given number is prime");
		}else {
			System.out.println("Given number is not prime number");
		}
	}
}
