package array_example;

public class WhileLoopExample {
	
	public static void main(String[] args) {
		
		int i = 1;
		
		while(WhileLoopExample.validateNumber(i)) {
			System.out.println(i);
			i++;
		}
	}





   public static boolean validateNumber(int i) {
	   boolean r = i <= 10;
	   return r;
	
     }
}   
   
   
   
