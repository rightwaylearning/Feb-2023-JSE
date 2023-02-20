package local_variables_instance_variable;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Test t = new Test();
		t.a = 25;
		t.b =20;
		t.m1();
		
		
		Test t1 = new Test();
		t1.a = 10;
		t1.b = 5;
		t1.m1();
	}

}
