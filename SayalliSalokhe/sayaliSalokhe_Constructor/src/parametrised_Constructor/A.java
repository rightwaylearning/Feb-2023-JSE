package parametrised_Constructor;

public class A {

	A() {
		System.out.println("default constructor zero parametrised");
	}

	A(int a,int b) {
		System.out.println("I have 2 parameters");
	}

	A(int a, int b, int c) {
		System.out.println("I have three parameter");
	}

}
