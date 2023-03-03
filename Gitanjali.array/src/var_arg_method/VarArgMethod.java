package var_arg_method;

public class VarArgMethod {
	void add(int a, int b) {
		int sum = a + b;
		System.out.println("total= " + sum);
	}

	void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println("total= " + sum);
	}

	void add(int a, int b, int c, int d) {
		int sum = a + b + c + d;
		System.out.println("total= " + sum);

	}

}
