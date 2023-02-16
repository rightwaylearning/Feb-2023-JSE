package static_instance_example;

public class Static_Instance {
	int a;
	int b;

	static int x;
	static int y;

	void m1() {
	}

	void m2() {
	}

	static void s1() {
	}

	static void s2() {
	}

	void test1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
		m1();
		m2();
		s1();
		s2();
	}

}
