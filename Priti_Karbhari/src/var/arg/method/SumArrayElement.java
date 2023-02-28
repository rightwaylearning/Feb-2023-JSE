package var.arg.method;

public class SumArrayElement {
	
	public static void main(String[] args) {
		 int[] arr = {10,22,30,40,55,60,77,80,99};
		 
		 int index =0;
		 int sum =0;
		 
		 while(index<arr.length) {
			 sum = sum + arr[index];
			  index++;
			 
		 }
		 System.out.println("Total = " + sum);
	}
}
