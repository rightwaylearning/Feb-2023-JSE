package Methode_overloding;

abstract  class Abstract_methode_overloading {
	
	abstract void m1();
	
	void m2() {
		System.out.println("This is m2");
	}

}

class child  extends Abstract_methode_overloading{
	
	void m1() {
		System.out.println("this is abstract method body");
	}
	
	void m3() {
		System.out.println("this is m3 method");
	}
}
