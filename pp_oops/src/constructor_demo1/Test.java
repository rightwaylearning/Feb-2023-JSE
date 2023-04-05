package constructor_demo1;

class M1{
	M1(){
	 super();
		System.out.println("I am M1 class Constructor");
	}

	}

class N1 extends M1{
	N1(){
	super();
		System.out.println("I am N1 class Constructor");
	}
}

class J extends N1{
	J(){
	super();	
		System.out.println("I am J class Constructor");
	}
}

class K extends J{
	K(){
    super();
		System.out.println("I am K class Constructor");
	}
}


public class Test {
	int a;
	
	public Test(){
		super();
	}
	
	public static void main(String[] args) {
		
		new K();
	}

}
