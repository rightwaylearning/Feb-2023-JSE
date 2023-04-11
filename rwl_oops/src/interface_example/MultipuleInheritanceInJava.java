package interface_example;

interface A11{
	void m1();
}

interface A22{
	void m1();
}

class Child11 implements A11, A22{
	
	@Override
	public void m1() {
        System.out.println("I am single body ");		
	}
}


public class MultipuleInheritanceInJava {

	public static void main(String[] args) {
		
		A11 a1= new Child11();
		
		A22 a2= new Child11();
		
		a1.m1();
		a2.m1();
	}
}
