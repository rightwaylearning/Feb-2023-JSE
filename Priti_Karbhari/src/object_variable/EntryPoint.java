package object_variable;



public class EntryPoint {
public static void main(String[] args) {
		
		Circle.pi = 3.14f;
		
		Circle c1 = new Circle();
	
		c1.radius = 32.4f;
		
		   float result  = c1.infoMethod();
		   
		   System.out.println("First object result is " +result);
	

		   
		Circle c2 = new Circle();
		    
			c2.radius = 23.4f;
			
			float result2 = c2.infoMethod();	
		
			System.out.println(result2);   
	
	}


}
