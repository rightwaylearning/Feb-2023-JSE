package poly.examples;

public class P {

	void m1() {
		System.out.println("I am Parent class m1 method");
	}
}

class C extends P{
	
	void m1() {
		System.out.println("I am Child class m1 method");
	}
}
