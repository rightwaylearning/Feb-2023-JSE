package abstraction_method;

public class Case1 {

	int a=12;
	String b;
	
	
	void m1() {
	
		System.out.println("this is method m1");
		
		System.out.println(this.a);
		
//		System.out.println();
		
	}
	
	void m2() {
		System.out.println("this is method m2");
	}
	
	void m3() {
		
		this.m2();
		
	}
	
	static void m4() {
		System.out.println("this is static method m4");
	}
	
	static void m5() {
		
//		we can only here static properties direct
		
		Case1.m4();
		
	}
	
	
	
	
}
