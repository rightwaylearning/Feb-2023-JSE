package methods_variable_cases;

public class Case1 {
	int a;
	int b;
	static int x;
	static int y;
	
	void m1 () {     // instance method - we can access both variables static and instance
		
		System.out.println(a);
		System.out.println(b);  
		System.out.println(x);
		System.out.println(y);
	}
    
	static void m2 () { // static method - we can access only static variables 
		                // but if you want to access instance variable inside static method
		                // then we can declare object (c.a) 
		System.out.println(x);
		System.out.println(y);
		
		Case1 c = new Case1 ();
		
		System.out.println(c.a);
		System.out.println(c.b);
	}
}
