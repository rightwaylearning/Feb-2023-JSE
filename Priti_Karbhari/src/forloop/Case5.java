package forloop;

public class Case5 {
	
	public static void main(String[] args) {
		
		String[] arr = {"aa","cc","dd","ff","hh","uu","pp"};
		
		String target = "dd";
		
		for (int i = 0; i < arr.length; i++) {
			
			if(arr[i] == target) {
				
				System.out.println("the target value is " + arr[i] + " valid index is " + i);
			}
			
		}
	}

}
