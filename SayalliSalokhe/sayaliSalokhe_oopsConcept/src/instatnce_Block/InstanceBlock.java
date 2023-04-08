package instatnce_Block;

class A{
	int a;
	int b;
	
	
	{
		System.out.println("Instatnce block");
		a=10;
		b=200;
		System.out.println("a and b:"+a+" "+b);
	}
	public A() {
		System.out.println("Constructor of class a");
	}
	public A(int i) {
		System.out.println("parameteried Constructor of class a");
		
	}
	void m1(){
		System.out.println("m1 of class A");
	}
}

public class InstanceBlock {
public static void main(String[] args) {
	A a=new A();
	a.m1();
	System.out.println("---------------------------------");
	A a2=new A(10);
	a.m1();
}
}
