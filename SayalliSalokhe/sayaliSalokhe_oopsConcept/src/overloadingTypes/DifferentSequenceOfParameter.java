package overloadingTypes;

public class DifferentSequenceOfParameter {
	void s(int a, float b) {
		System.out.println("int float parameters");
	}

	void s( float b,int c) {
		System.out.println("int float double  parameters");
	}

	void s(double a, char b) {
		System.out.println("int char parameters");
	}

	void s(float a,int b,char c) {
		System.out.println("char   parameters");
	}

}
