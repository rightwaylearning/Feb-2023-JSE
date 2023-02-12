package static_instance_method_rule;

public class B {
	
	void B1 () {
		A a = new A ();
		System.out.println(a.a);
		System.out.println(a.b);
		
		System.out.println(A.x);
		System.out.println(A.y);
		
		a.m1();
		a.m2();
		
		A.s1();
		A.s2();
				
	}
    static void B2 () {
    	A a = new A ();
		System.out.println(a.a);
		System.out.println(a.b);
		
		System.out.println(A.x);
		System.out.println(A.y);
		
		a.m1();
		a.m2();
		
		A.s1();
		A.s2(); 	
    }
}
