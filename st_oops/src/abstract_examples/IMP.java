package abstract_examples;

public class IMP {
	
	public static void main(String[] args) {
		
		// case 1
		
		Parent p = new Parent();
		p.homeConstruction();
		p.bankBalance();
		// p.ownBussiness();  //The method ownBussiness() is undefined for the type Parent
		
		System.out.println("----------------------------------------------------------");
		
		// Case 2
		
		Child c = new Child();
		c.homeConstruction();
		c.bankBalance();
		c.ownBussiness();
		
		System.out.println("-------------------------------------------");
		
		//Case 3
		
		Parent p1 = new Child();
		p1.homeConstruction();
		p1.bankBalance();
	//	p1.ownBussiness();  // C.E
		
	}

}
