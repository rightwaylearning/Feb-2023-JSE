package overriding_Rule;

class A {
	void m1(int a) {//m1(int)
		System.out.println("m1 of A");

	}

}

class B extends A {
	@Override
	void m1(int a) {//m1(int)
		System.out.println("m1 of B");
	}
}

public class Rule1_MethodSignatureSame {
	public static void main(String[] args) {

	}

}
