package var.arg.method;

public class Evensum {
	
	public static void main(String[] args) {
		
		int[] a = {12,21,33,44,20,18,11,88,8};
	
		int i = 0;
		int len = a.length;
		int sum = 0;
		
		System.out.println("even no are = ");
		 while(i < len) {
			 
		 
		 
			 if(a[i]%2 == 0) {
				
				 System.out.println(a[i]);
				sum = sum + a[i];
		 }
			 
		i ++;
		 }
		//System.out.println("even no are = "+ sum);

}
 }
