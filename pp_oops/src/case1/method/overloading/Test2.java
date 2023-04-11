package case1.method.overloading;

class C {
	void m1(Object o) {
		System.out.println("Object");
	}

	void m1(Number n) {
		System.out.println("Number");
	}

	void m1(Integer n) {
		System.out.println("Integer");
	}
}

public class Test2 {
	public static void main(String[] args) {
        
		C c=new C();
		c.m1(10.00);
	}
}
