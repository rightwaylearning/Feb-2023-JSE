package super_contructor_call;

class P{
	void m1() {
		System.out.println("I am m1 of P");
	}
}

class C extends P{
	
	void m1() {
		System.out.println("I am m1 of C");
	}
	
	void m2() {
		super.m1();
		System.out.println("I am m2 of C");
	}
}


public class SuperKeywordExample1 {

	 public static void main(String[] args) {
		
		 C c= new C();
		 c.m2();
	}
}
