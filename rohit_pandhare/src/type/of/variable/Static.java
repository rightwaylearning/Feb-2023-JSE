package type.of.variable;

public class Static {
	
	int a ;
	int b ;
	static int z;
	
	void m1() {
		
		int r = a + b+z;
		System.out.println("this is instance method "+r);
	}

   static void m2() {
		
		int r = z;
		System.out.println("this is static field ");
	}

}
