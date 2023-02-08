package type.of.variable;

public class Static {
	
	int a ;
	int b ;
	static int z;
	
	void m3() {
		
		int r = a + b+z;
		System.out.println("this is instance method "+r);
	}

   static void m2() {
		
//		int r = z;
		System.out.println("this is static field ");
	}
   
   void m1(Static obj) {
	   int a = 1000;
	   System.out.println(a);
       System.out.println("ya madhe object " +obj.b);
   }

}
