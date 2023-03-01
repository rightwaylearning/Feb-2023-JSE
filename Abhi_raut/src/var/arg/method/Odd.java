package var.arg.method;

public class Odd {
      
	public static void main(String[] args) {
		
		int[] odd = {12,11,23,25,26,14,78,89,78,99,85,56,45,12,12,56,55,4,1,26,7};
		
		int i =0;
		int sum =0;
		
		while(i<odd.length) {
			
			if(odd[i]%2!=0) {
				System.out.println(odd[i]);
				sum = sum + odd[i];
			}
			  i++;
		}
		    System.out.println("Sum of odd numbers are = "+ sum);
	}
	
}
