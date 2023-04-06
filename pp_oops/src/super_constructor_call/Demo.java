package super_constructor_call;

class Parent {
	int x;
	int y;

	Parent(int x, int y) {
		this.x = x;
		this.y = y;
		System.out.println("Parent");
	}
}

class Child extends Parent {
	int a;
	int b;

	Child(int a, int b, int x, int y) {
		super(x, y);
		this.a = a;
		this.b = b;
		System.out.println("Child");
	}

	void m1() {
		System.out.println(a);
		System.out.println(x);
	}
}

public class Demo {
	public static void main(String[] args) {
        Child c= new Child(10,20,30,40);
        c.m1();
	}
}