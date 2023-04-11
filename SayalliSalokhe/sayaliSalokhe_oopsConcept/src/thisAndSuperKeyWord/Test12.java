package thisAndSuperKeyWord;

class A1 {
	// instance variable
	int a=10;
	int b=20;

	A1() {
		//Constructor
		int a = 30;
		int b = 40;
		System.out.println("Constructor:"+a);
		System.out.println("Constructor:"+b);
	}

}

class B1 extends A1 {
	int a=70;
	int b=80;
	public B1() {
		super();
	}
	void m1() {
		// local variable
		int a = 50;
		int b = 60;
		System.out.println("local Variable:"+a);
		System.out.println("local Variable:"+b);
		System.out.println("Current class object property:"+this.a);
		System.out.println("Current class object property:"+this.b);
		System.out.println("parent class object property:"+super.a);
		System.out.println("parent class object property:"+super.b);
		
		
		
	}

}

public class Test12 {
	public static void main(String[] args) {
		B1 b1=new B1();
		b1.m1();

	}

}
