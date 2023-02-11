package access.of.method.in.other.class_method;

public class Case2 {
	
	void k1() {
		System.out.println(Case1.x); // 
		System.out.println(Case1.y); // 
		Case1.s1(); //
		Case1.s2(); //
		
		Case1 a= new Case1();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
	}
	
	static void k2() {
		System.out.println(Case1.x); // 
		System.out.println(Case1.y); // 
		Case1.s1(); //
		Case1.s2(); //
		
		Case1 a= new Case1();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
	}

}
