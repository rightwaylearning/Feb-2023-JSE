package local_variable_instance_vairable;

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
