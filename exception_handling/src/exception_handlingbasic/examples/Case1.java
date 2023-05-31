package exception_handlingbasic.examples;

public class Case1 {

	public static void main(String[] args) {
		
		int[] arr = {10,20};
		
		try {
		  System.out.println(arr[4]);
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("I am child");
		}catch (Exception e) {
			System.out.println("I am Parent");
		}	
		
		
		// 
			
		
	}
}
