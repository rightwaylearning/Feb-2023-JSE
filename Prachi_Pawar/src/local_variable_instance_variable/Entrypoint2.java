package local_variable_instance_variable;

public class Entrypoint2 {

	public static void main(String[] args) {
		
		Test2 t1= new Test2();
		t1.a=1;
		t1.b=2;
		
		t1.m1();
		
		Test2 t2= new Test2();
		t2.a=10;
		t2.b=20;
		
		t2.m1();
	}
}
