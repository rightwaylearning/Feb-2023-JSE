package overloadingTypes;

public class DifferentTypeOfParameters {
	void p(int a, float b) {
		System.out.println("int float parameters");
	}

	void p(int a, float b,double c) {
		System.out.println("int float double  parameters");
	}

	void p(int a, char b) {
		System.out.println("int char parameters");
	}

	void p(char a) {
		System.out.println("char   parameters");
	}

}
