package employee.info;

public class Switcher {
	
	void m1(Object o) {
		
		if(o instanceof AA) {
			AA a = (AA)o;
			a.testMe();
			
		}
		
		if(o instanceof BB) {
			BB b = (BB)o;
			b.testMyself(); 
		}
		
		if(o instanceof CC) {
			CC c = (CC)o;
			c.testI();        
		}
		                                              
	}

}

class AA{
	void testMe() {
		System.out.println("I am AA testMe method");
	}
}

class BB{
	void testMyself() {
		System.out.println("I am BB class testMyself");
	}
}

class CC{
	void testI() {
		System.out.println("I am CC class testI method");
	}
}
