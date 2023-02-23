package equality_opt_example;

class A{}

	class B{}
	class C extends B{}
	

public class Example {
	
	public static void main(String[] args) {
		
		A a1= new A();
		A a2= new A();
		
		boolean r1 = a1 ==a2;
		System.out.println(r1);
//................................
		
		B b1 = new B();
		B b2= new B();
		System.out.println(b1 == b2);
		
//...................................
		
		C c9=new C();
		Object o7= c9;
		System.out.println(c9 == o7);

	}

}
