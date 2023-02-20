package employee.info;

public class Switcher {

	void m1(Object o) { // Object o = new CC();
		
	 if(o instanceof AA) {
		AA a = (AA)o;
		a.testMe();
	 }	

	 if(o instanceof BB) {
		 BB b =(BB)o;
		 b.testMySelf();
	 }
	 
	 if(o instanceof CC) {
		 CC c =(CC)o;
		 c.testI();
	 }
	}
}

class AA{
	void testMe() {
		System.out.println("I am AA class testMe method");
	}
}

class BB{
	void testMySelf() {
		System.out.println("I am BB class testMySelf method");
	}
	
}

class CC{
	void testI() {
		System.out.println("I am CC class testI method");
	}
}
