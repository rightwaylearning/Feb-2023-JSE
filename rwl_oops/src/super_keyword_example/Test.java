package super_keyword_example;

class P{
	int a =10;
	int b = 20;
	int x =200;
}

class C extends P{
	int a = 30;
	int x =1;
	int b = this.x;
	
	void m1() {
		int a =50;
		int b = 60;
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(super.a);
		System.out.println(super.b);
	}
}


public class Test {

	public static void main(String[] args) {
		C c=new C();
		c.m1();
	}
}
