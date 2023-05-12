package string.class_constructor;

public class Test {

	
	public static void main(String[] args) {
		
		String s = new String();  //1
		
		
		String s1= new String("abc");
		
		// String, StringBuffer, StringBuilder 
		
		
		String s3 = new String( new StringBuffer("abc"));   //  public String(StringBuffer br){}
	
	    String s4 = new String(new StringBuilder("abc"));
	    
	    // what is string >> collection of character
	    
	    char[] arr = {'A','B','C'};
	    
	    String s6 = new String(arr); // public String(char[] arr){}
	    
	    System.out.println(s6);
	    
	    byte[] arr1 = {65,66,67,97}; // ABCa
	    
	    String s7 = new String(arr1);
	    System.out.println(s7);
	}
}
