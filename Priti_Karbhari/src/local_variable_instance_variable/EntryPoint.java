package local_variable_instance_variable;

public class EntryPoint {
	
	public static void main(String[]data) {
		
		Test t1 = new Test();
		t1.a = 1;
		t1.b = 2;
		t1.m1();
		
		Test t2 = new Test();
		t2.a = 10;
		t2.b = 20;
		t2.m1();
		
	}

}
