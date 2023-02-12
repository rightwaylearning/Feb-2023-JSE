package methods_variable_access;

public class Case1 {
   
	int x;
	int y;
	static int m;
	static int n;
	
	void m1() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(m);
		System.out.println(n);
		
	}
	  static void m2() {
		  Case1 c = new Case1();
		  System.out.println(c.x);
		  System.out.println(c.y);
		  System.out.println(m);
		  System.out.println(n);
	  }
}
