package abstract_example;

public class IMP {

	 public static void main(String[] args) {
		
		// case 1
			
			Parent p = new Parent();
			p.HomeConstruction();
			p.bankBalance();
		//	p.ownBussiness(); 
			System.out.println("=============================================");
			
			// case 2
			
			Child c= new Child();
			c.HomeConstruction();
			c.bankBalance();
			c.ownBussines();
			
			System.out.println("================================================");
			
			// case 3
			
			Parent p1 = new Child();
			p1.HomeConstruction();
			p1.bankBalance();
		//	p1.ownBussiness(); // C.E
			
			
		}

	}

