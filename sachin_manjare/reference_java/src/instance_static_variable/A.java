package instance_static_variable;

public class A {
	int a;
	int b;
	static int x;
	static int y;
	
	void m1() {
		
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(A.x);
		System.out.println(A.y);
		
	           }

	 static void m2() {
		 
		 A a =new A();
		 
		  System.out.println(a.a);
		  System.out.println(a.b);
		  System.out.println(A.x);
		  System.out.println(A.y); 
		 
	                  }	 
}
