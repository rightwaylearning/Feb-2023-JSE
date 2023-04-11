package test;

interface A {

    void m1();
	void m2();
}

class Child implements A{
	
	@Override
	public void m1() {
		System.out.println("I am m1");
	}
	
	@Override
	public void m2() {
		System.out.println("I am m2");
	}
}

public class OPT{
	
	public static void main(String[] args) {
		
	//	A a= new A();
		
		A a= new Child();
		a.m1();
		a.m2();
	}
}
