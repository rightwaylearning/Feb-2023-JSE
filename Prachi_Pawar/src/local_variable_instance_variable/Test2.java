package local_variable_instance_variable;

public class Test2 {
	
	int a;
	int b;
	
	void m1(Test2 this) {
		int a=100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(b);
	}
	

}
