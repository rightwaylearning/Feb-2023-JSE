package var.arg.method;

public class Even {
     
	public static void main(String[] args) {
		
		int[] even = {20,25,23,14,25,26,78,89,65,95,98,85,88,44,74,12,23,32,11};
		
		int i = 0;
		int sum =0;
		
		while(i<even.length) {
			
			if(even[i]%2==0) {
			System.out.println(even[i]);
			sum = sum + even[i];
		}
			i++;
		}
		
		System.out.println("Sum of even numbers are = "+sum);
	}
}
