package logical_opt;

import java.security.DomainCombiner;

public class Test1 {
	static int a = 10;
	static int b = 20;

	public static boolean exp1() {
		return a + b == b;
	}

	public static boolean exp2() {
		return b == 20;
	}

	public static void main(String[] args) {
		if (Test1.exp1() && Test1.exp2()) {
			System.out.println("True Part");
		} else {
			System.out.println("False Part");

		}

	}
}