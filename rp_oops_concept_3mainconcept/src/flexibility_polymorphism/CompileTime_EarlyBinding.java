package flexibility_polymorphism;

public class CompileTime_EarlyBinding {

	void m1(int a) {

		System.out.println("hello one");
	}

	void m1(int a, int b) {
		System.out.println("hello two");
		
		
	}

//	type of parameter different
	void m1(int a, float b) {
		System.out.println("hello two but different parameter");
		

	}

//2.number of parameter
	void m1(int a, int b, int c) {
		System.out.println("hello number of parameter");
		

	}

//sequence different
//name same but different parameter is called method overloading
	void m1(float a, int b) {
		System.out.println("hello sequence change");
		
		
	}

}
