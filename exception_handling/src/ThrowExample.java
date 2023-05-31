import java.io.File;

public class ThrowExample {

	public static void main(String[] args)  {
		System.out.println("1");
		A a = new A();
		a.m3();
		System.out.println("8");
	}
}

class A {

	void m3()  {
		System.out.println("2");
		B b = new B();
		try {
		b.m2();
		}catch (Exception e) {
			System.out.println("I am m3 of A class");
		}
		System.out.println("7");
	}

}

class B {

	void m2() throws Exception {
		System.out.println("3");
		C c = new C();
		c.m1();
		System.out.println("6");
	}

}

class C {

	void m1() throws Exception {
		System.out.println("4");
		File f = new File("");
		f.createNewFile();
		System.out.println("5");

	}
}
