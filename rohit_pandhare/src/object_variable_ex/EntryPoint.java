package object_variable_ex;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Circle.pi = 3.14f;
		
		Circle c1 = new Circle();
	
		c1.radius = 32.4f;
		
		   float result  = c1.infoMethod();
		   
		   System.out.println("First object result is " +result);
	
//  ya madhe kiti jr object kinva instance banavle tyala jr common mhnje
//	static value dili tr chalel but dusrya Entrypoint madhe hi var
//  dileli mhnje  Circle.pi  hi dili static property nahi chalnar  
		   
		Circle c2 = new Circle();
		    
			c2.radius = 23.4f;
			
			float result2 = c2.infoMethod();	
		
			System.out.println(result2);   
	
	}

}
