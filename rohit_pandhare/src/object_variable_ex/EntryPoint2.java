package object_variable_ex;

public class EntryPoint2 {
	
	public static void main(String[] args) {
		
//		aapn jr multiple classes banavla tr yat nahi chalnar ts 
//		Circle.pi hai dyavcha lagel sarvana vegla class madhe vegla
		
	    Circle.pi = 3.14f;
		
		Circle c = new Circle();
	    
		c.radius = 23.4f;
		
		float result = c.infoMethod();	
	
		System.out.println(result);
	}

}
