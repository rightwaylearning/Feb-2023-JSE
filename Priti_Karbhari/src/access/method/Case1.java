package access.method;



public class Case1 {
	int a;
	int b;
	static int x;
	static int y;
	
	void m1() {};
	void m2() {};
	
	static void s1() {}
	static void s2() {}
	
	void test1() {
		System.out.println(a); // this.a
		System.out.println(b); // this.b
		System.out.println(x); // A.x
		System.out.println(y); // A.y
		m1(); // this.m1();
		m2(); // this.m2();
		s1(); // A.s1();
		s2(); //A.s2();
		
	}
	
	static void test2() {
		System.out.println(x); // A.x
		System.out.println(y); // A.y
		s1(); // A.s1();
		s2(); //A.s2();
		
		Case1 a= new Case1();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
	}


}
