package constructor_demo1;

class M1{
	M1(){
		super();
		System.out.println("I am M class constuctor");
	}
}

class N1 extends M1{
	
	N1(){
		super();
		System.out.println("I am N class constuctor ");
	}
}
class J extends N1{
	J(){
		super();
	}
}
class K extends J{
	
	K(){
		super();
		System.out.println("I am K class constuctor ");
	}
}


public class Test {
     int a;
	
	
	public Test() {
		super();
	}


	public static void main(String[] args) {
		
		new K();
	}
}
