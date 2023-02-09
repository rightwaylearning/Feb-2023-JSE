package local_variable_instance_variable;

public interface Entrypoint1 {
	
	public static void main(String[] args) {
		 
		Test1 t1= new Test1();
		t1.a=1;
		t1.b=2;
		
		t1.m1(t1);
		
		Test1 t2= new Test1();
		t2.a=10;
		t2.b=20;
		
		t2.m1(t2);
	}

}
