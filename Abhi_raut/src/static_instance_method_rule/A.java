package static_instance_method_rule;

public class A {
	
	int a;
	int b;
	static int x;
	static int y;
	
	void m1 () {}
	void m2 () {}
	
	static void s1 () {}
	static void s2 () {}
	
	void a1 () {
		                          // best practice 
		System.out.println(a);    // this.a
		System.out.println(b);    // this.b
		System.out.println(x);    // A.x
		System.out.println(y);    // A.y
		m1(); // this.m1()
		m2(); // this.m2()
		s1(); // A.s1()
		s2(); // A.s2()
	}
	

}
