package reverse.order.printing;

public class PrintEvenOddOfArray {
	
	public static void main(String[] args) {
		
		
		int[] a = {12,21,33,44,20,18,11,88,8};
		int sum = 0;
		int i = 0;
		int len =a.length;
		
		System.out.println("Even Numbers are  ");
		while(i < len){
			
			if(a[i]%2 == 0 ) {
			System.out.println(a[i]);
			sum = sum + a[i];
			}
			
			i++;        

		}
		System.out.println("sum of these no "+sum);
		System.out.println("value of i is = "+i);
	
		int oddsum =0;
		
		int i1 = 0;
		System.out.println("<<<<<<odd Numbers are>>>>>>>>> ");
		while(i1 < len){
			
			if(a[i1]%2 != 0 ) {
			System.out.println(a[i1]);
			oddsum = oddsum + a[i1];
			}
			
			i1++;        

		}
		System.out.println("sum of Odd no "+oddsum);
		
		
	}

}
