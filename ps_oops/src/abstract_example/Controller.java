package abstract_example;

public class Controller {
      public static void main(String[] args) {
		
    	  Parent p = new Parent();
		  p.HomeConstruction();
		  p.bankBalance();
		  System.out.println("-----------------------------");
		  
		  Child c = new Child();
		  c.HomeConstruction();
		  c.bankBalance();
		  c.ownBussines();
		  System.out.println("------------------");
		  
		  Parent p1 = new Child();
		  p1.HomeConstruction();
		  p1.bankBalance();
	   // p1.ownBussines();//  C.E
		  
	}
      
     
      
}
