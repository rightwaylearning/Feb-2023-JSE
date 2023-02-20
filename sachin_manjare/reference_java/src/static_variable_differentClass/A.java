package static_variable_differentClass;

public class A {
	int a;
	int b;
	static  int x;
	static int y;
	
	
	
	void k1() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(x);
		System.out.println(y);
	
	}
	static void k2() {
	
		A a = new A();
		
		System.out.println(a.a);
		System.out.println(a.b);
		System.out.println(x);
		System.out.println(y);
	
		
		
		
		
		
	}
	
	

}


}
