package abstract_class_for_abstraction;

public class Controller {
	
	
	public static void main(String[] args) {
		
		
//		if child class is not happy with parent class method body implementation then
//		child class change karte parent class madhla method override karun
//		child class madhe
		
		
		
		Parent p = new Child();
	      p.buildHome();
	      p.property();
	      
	      
	      System.out.println("<<<<<<<>>>>>>>>>");
	      
	      Child c = new Child();
	      c.buildHome();
	      c.property();
		
		
	}

}
