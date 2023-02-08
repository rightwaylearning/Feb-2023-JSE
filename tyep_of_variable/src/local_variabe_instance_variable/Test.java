package local_variabe_instance_variable;

public class Test {
	
	public int a;
	public int b;
	
	public void m1() {
		int a = 100;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(b);
	}

}

// full name 
// local_variabe_instance_variable.Test