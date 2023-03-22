package abstraction_method;

public class Child extends Case1 {
	
	void m1() {
	    System.out.println("this a hai yat aahe "+this.a);
	}
	
	
	void access2() {
		this.m2();
		System.out.println(">>>>>><<<<<<<");
		this.m3();
	}

	static void access3() {
		Case1.m4();
	}
}
