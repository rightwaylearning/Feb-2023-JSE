package in_same_class;

public class Entrypoint {
//	public static void main(String[] args) {
		
	
	void m1() {
		Case1 c = new Case1();
		System.out.println(c.x);
		System.out.println(c.y);
		
		System.out.println(Case1.m);
		System.out.println(Case1.n);
		
	}
	
	static void m2() {
		Case1 c = new Case1();
		System.out.println(c.x);
		System.out.println(c.y);
		
		System.out.println(Case1.m);
		System.out.println(Case1.n);
	} 
	}

