package overloadingTypes;

public class DifferentNoOfParameters {

	void m1(int a) {
		System.err.println("1 parameter int");
	}

	void m1(int a,int b) {
		System.err.println("2 parameter int");
	}

	void m1(int a,int b,int c) {
		System.err.println("3 parameter int");
	}

	void m1(int a,int b,int c,int d) {
		System.err.println("4 parameter int");
	}
}
