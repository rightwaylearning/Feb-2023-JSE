package abstract_example1;

public class Imp {
	
	public static void main(String[] args) {
		Parent p=new Parent();   //   case 1
		p.homeConstruction();
		p.bankBalance();
		//p.ownBussiness();  //  this method() is undefined  Parent class	Complie time error	
		
		
		System.out.println("***********************");
		
		Child c=new Child();
		c.homeConstruction();
		c.bankBalance();
		c.ownBussiness();
		

		System.out.println("***********************");
		
		Parent p1=new Child();
		p1.homeConstruction();
        p1.bankBalance();		
       // p1.ownBussiness();  not possible 
	}
	
	

}
