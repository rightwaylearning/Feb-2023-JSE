package static_instance_method_variable;


public class Other {
	void o1() {
		System.out.println(A.x); 
		System.out.println(A.y); 
		A.s1(); 
		A.s2(); 
		
		A a= new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
	}
	
	static void o2() {
		System.out.println(A.x); 
		System.out.println(A.y); 
		A.s1(); 
		A.s2(); 
		
		A a= new A();
		System.out.println(a.a);
		System.out.println(a.b);
		a.m1();
		a.m2();
	}
}
