package forloop;

public class BreakCase {
	
	public static void main(String[] args) {
		
		int[] arr = {12,34,45,56,67,88,89,87,65,54};
		
		int target = 67;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				System.out.println("the target number is = "+ arr[i] + " index is "+ i);
				
				break;
			}
			System.out.println("the index are to check " + arr[i]+ " value are " + i);
		}
	}

}
