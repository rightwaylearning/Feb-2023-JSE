package var.arg.method;

public class SumOfArrayLements {

	public static void main(String[] args) {
		 int[] arr = {10,20,30,40,50,89,90,67,90,90,90,78,45,378,46,67,3453,345,334,456,45,6456,456};
		 int sum  =0;
		 int index  = 0;
		 
		 while(index < arr.length) {
			 sum = sum + arr[index];
			 index++;
		 }
		
		 System.out.println("total " + sum);
		
	}
}
