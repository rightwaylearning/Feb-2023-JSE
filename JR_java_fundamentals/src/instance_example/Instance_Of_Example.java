package instance_example;


class A{
	
}

class B extends A{
	
}

class C{
	
}

public class Instance_Of_Example {
	
	public static void main(String[] args) {
		
		A a = new A();
		
		boolean X = a instanceof A;
		System.out.println(X);
		
		boolean Y =a instanceof B;
		System.out.println(Y);
	
		
	}

}
