package this_var_ref_example;

public class Test {
	int a;
	int b;
	
	void m1(int b) {
		int a=87;
		b=3;
		
		this.a=5;
		a=this.a;
	
		this.b=12;
		this.a=32;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(this.a);
		System.out.println(this.b);
	}

}
