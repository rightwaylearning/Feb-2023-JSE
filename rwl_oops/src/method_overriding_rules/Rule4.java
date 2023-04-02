package method_overriding_rules;


class Z{
	
    private  void m1() {
		System.out.println("Parent");
	}
    
    void dumy() {
    	this.m1();
    }
   
}

class Y extends Z{
	
	
	private void m1() {
		System.out.println("Child");
	}
	
	
}


public class Rule4 {

	public static void main(String[] args) {
		
		Z z= new Y();  // case 3 // child // parent
	    z.dumy();	
	}
}
