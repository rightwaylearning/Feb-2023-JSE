package this_var_ref_example;

public class Test {
	int a;
	int b;
	
	void m1(int b) {
		int a=10;
		b=20;
		this.a=100;
		a=this.a;
		a=2;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
	}

}
