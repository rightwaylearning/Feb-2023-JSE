package overide_practice;

public class Impoveride {
	
	public static void main(String[] args) {
		
		parent p= new parent ();
		p.homeConstruction();
		p.fixDeposite();
	 System.out.println("----------");

	    child d= new child();
	    
	    d.homeConstruction();
	    d.business();
	    System.out.println("=======");
	    
	    parent p1=new child();
	    p1.homeConstruction();
	    p1.fixDeposite();
	    
		
	}
	
	

}
