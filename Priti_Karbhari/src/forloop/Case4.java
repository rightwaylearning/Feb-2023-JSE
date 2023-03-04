package forloop;

public class Case4 {
	
	public static void main(String[] args) {
		
		int[] arr = {12,11,23,22,34,33,45,44,56,55,67,55,68,77};
		
		int target =44;
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				System.out.println("the target value is" + arr[i] + "valid index is" + i);
			}
			
		}
	}

}
