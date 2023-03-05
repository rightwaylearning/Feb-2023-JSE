package while_loop_examples;

public class Printer {
	
	public static void print(int[] arr) {
		int index=0;
		
		while(index< arr.length) {
			System.out.println(arr[index]);
			index++;
			
		}
		
		System.out.println(">>>>>>");
	}
}
