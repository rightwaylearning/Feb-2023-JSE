package methods_variable_access;

public class Case1 {
	int a;
	int b;
	static int m;
	static int n;
	
	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(m);
		System.out.println(n);
		
	
	}
	
	static void m2() {
		
		Case1 c = new Case1();
		System.out.println(c.a);
		System.out.println(c.b);
		System.out.println(m);
		System.out.println(n);
		
	}
	

}
