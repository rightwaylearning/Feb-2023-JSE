package abstract_practice;

public class IMP {

	public static void main(String[] args) {

		Parrent p = new Parrent();
		p.constructBuilding();
		p.fixDeposite();
		// p.buildBusiness();

		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~");

		Child c = new Child();
		c.constructBuilding();
		c.fixDeposite();
		c.buildBusiness();

		System.out.println("==================================");

		
		  Parrent p1= new Child();
		  p1.constructBuilding(); 
		  p1.fixDeposite();
		 
		  
		 //p1.buildBusiness();
		 

	}

}
