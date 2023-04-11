package compile_time_polyBy_overloading_Cases;

class A{
	
}
class B extends A{
	
}
class C extends B{
	
}


public class Case4 {
	
//	Case3 is for userdefine ref
//	1.exact match
//	2.recent parent
	
	
	void m1(C c) {
		System.out.println("C type");
		
	}
	
	
	void m1(B b) {
		System.out.println("B type");
		
	}
	
	void m1(A a) {
		System.out.println("A type");
		
	}
	void m1(Object obj) {
		System.out.println("Object type");
		
	}
	
	
	public static void main(String[] args) {
		
//		Case4 is for null
//		null is going to point only connection
		
//		child only chocolate nehmi parent child lach detat na
		
		Case4 c = new Case4();
		c.m1(new B());
		
		c.m1(null);
		
	}
	
	
	

}
