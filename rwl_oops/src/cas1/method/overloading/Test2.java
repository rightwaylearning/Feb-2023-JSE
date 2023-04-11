package cas1.method.overloading;

class C {
	void m1(Object o) {
		System.out.println("Object");
	}

	private void m1(Number n) {
		System.out.println("Number");
	}

	static void m1(Integer n) {
		System.out.println("Integer");
	}

	public void m1(String n) {
		System.out.println("String");
	}
}

public class Test2 {
	public static void main(String[] args) {
       C c= new C();
       c.m1(10);
	}
}
