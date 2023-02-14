package instance.stat.pack;

public class Testing {

	public static void main(String[] args) {
		
		Test.m2(); //and hai static method call aahe by class
		
		Test.z = 999 ; //static var declaration
		
		Test t1 = new Test();
		
		t1.a = 32;
		t1.b = 12;
		
		t1.m1(); //method call by ref var(object)
		
//		in instance method this ref var is available
		
//		this is ref var pointing towards object which object 
//		the object which is calling that method
		
	}
}

