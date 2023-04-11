package instance_block;

class A{
	int a;
	static int b;

	static {
		System.out.println("I am first static block");		
	}
	
	{
		System.out.println("i am first instance block");
	}
	
	 A(){
		 System.out.println("I am zero arg constructor");
	 }
	 
	 A(int a){
		 System.out.println("single parameter constrcutor");
	 }
	 
	 void m1() {
		 System.out.println("I am instance m1 method of A class");
		 m2();
	 }
	 
	 static {
	    System.out.println("I am second static block");	 
	 }
	 
	 static void m2() {
		 System.out.println("I am static m2 method of A class");
	 }
	
	 {
		 System.out.println("I am second inatance block");
	 }
}

public class InstanceBlock {

	public static void main(String[] args) {
      
		A a= new A();
		a.m1();
		// after object creation in side class from top to bottom all instance block execution is haapen.
		
		System.out.println("-----------------------------");
		
		A a1= new A(10);
		a1.m1();
		
       System.out.println("-----------------------------");
		
		A a2= new A(10);
		a2.m1();
		
	}
}
