package Instance_of_Opterator;

class A {
}

class B extends A {
}

class C {
}

public class Instance_Of_Opterator {
	public static void main(String[] args) {
		A a = new A();
		boolean f = a instanceof A;
		System.out.println(f);
		boolean f1 = a instanceof B;
		System.out.println(f1);
	}
}
