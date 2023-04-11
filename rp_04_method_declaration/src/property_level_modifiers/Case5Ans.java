package property_level_modifiers;

public class Case5Ans {

	public static void main(String[] args) {
		
		
		
		Case5final c = new Case5final("helloargument");
		
	  System.out.println("this is first argupassing  "+c.name);
	  
//	  c.name ="hekkii";
//	  yala parat ekda value assign nahi karta yenar karan hai final aahe tya mule
	  
	  Case5final c1 = new Case5final("hello2argu");
		
	  System.out.println("this is second argupassing  "+c1.name);
	  
		
	}
	
	
}
