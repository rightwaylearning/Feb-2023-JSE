package string.class_methods;

public class StringClassMethods {

	
	public static void main(String[] args) {
		// 1]
		 // diff between legth property & length() method
		String str = "hello";  // 5  >> 0 to 4   >> length = 5  >> index 0 to 4
		// string is collection of character;
		
		int[] arr = {10,20,30,40,50};  // 5 >> index 0 to 4
		
	      int arrlength	= arr.length;  // 5
	      
	      int stringLength = str.length();  // 5
	      
	      //----------------------------------------------------------
	      
	   //  System.out.println(arr[11]);  // 20 
	     
	     System.out.println(str.charAt(11)); //e
	     
	    // ArrayIndexOutOfBoundsException
	    // StringIndexOutOfBoundsException
	}
	
}
