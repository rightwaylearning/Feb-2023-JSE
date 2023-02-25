package parametrised_Constructor;

public class A_Controller {
	public static void main(String[] args) {
		// call zero parameter/no arg constructor
		A a = new A();

		// call two parameterised constructor
		A a1 = new A(10, 20);

		// call two parameterised constructor
		A a2 = new A(30, 450, 800);
	}

}
