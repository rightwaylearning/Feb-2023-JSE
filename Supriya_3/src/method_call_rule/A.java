package method_call_rule;

public class A {

	int a;
	int b;
	
	static int x;
	static int y;

	void m1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);	
	}
	
	static void m2() {
		System.out.println(x);
		System.out.println(y);
		
		A a1=new A();
		System.out.println(a1.a);
		System.out.println(a1.b);
	} 
}
