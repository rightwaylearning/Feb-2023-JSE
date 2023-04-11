package abstract_examples;

public class IMP {
	
	public static void main(String[] args) {
		
		// Case1
		Parent p = new Parent();
	    p.homeConstruction();
		p.bankBalance();
		//p.ownBusiness();C.E
		
		// Case2;
		Child c = new Child();
		c.homeConstruction();
		c.bankBalance();
		c.ownBussiness();
		
		// Case3
		Parent p1 = new Child();
		p1.homeConstruction();
		p1.bankBalance();
		// p1.ownBusiness();// C.E
		
				
	}

}
