package object_variable;


public class EntryPoint2 {
public static void main(String[] args) {
		
 
		
	    Circle.pi = 3.14f;
		
		Circle c = new Circle();
	    
		c.radius = 23.4f;
		
		float result = c.infoMethod();	
	
		System.out.println(result);
	}


}
