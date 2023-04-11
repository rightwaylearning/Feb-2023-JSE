package constructor_demo1;

import constructor_demo.A;

public class B {

	void m1() {
		
	 A a= A.getInstance();
	 
	}
}


class M{
	
	public void M() {
		System.out.println("I am M method");
		
	}
}

class N{
	public static void main(String[] args) {
		M m= new M();
		m.M();
	}
}
