package relational.operators;

public class Test {
	
	public static void main(String[] args) {
		
	
	int a = 10;
	int b = 20;
	
	boolean r1 = a > b;
	System.out.println(r1);
	
	String s = "123";
	String s1 = "124";
	
	//boolean b1 = s < s1;
//The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
	//System.out.println(b1);
	
	boolean b3 = true;
	int m = 10;
	//boolean r2 = b3 > m; // error
	
	boolean b5 = true;
	boolean b6 = true;
	//boolean r4 = b5 >= b6;
	// error
	
	  boolean r7 = 10 > 20;
	  System.out.println(r7); // false
	  
	//  boolean r8 = 10 > 9 > 8;
	          // r8 = true > 8;
	          // r8 =  error;
//The operator < is undefined for the argument type(s) java.lang.String, java.lang.String
	//  System.out.println(r8);
	  
	  System.out.println(10 > 'A');// false
	  System.out.println(10 >= 10.00F);//true
	  System.out.println('B'> 66.89); //false
	  System.out.println(31/2);
	  System.out.println(31/2.0);
	  
	  
	  
	}
}
	
	
	
