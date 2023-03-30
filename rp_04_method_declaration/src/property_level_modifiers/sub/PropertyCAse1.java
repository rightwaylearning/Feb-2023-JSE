package property_level_modifiers.sub;

import property_level_modifiers.Case1Protected;

public class PropertyCAse1 extends Case1Protected {
	
	public static void main(String[] args) {
		
		
		Case1Protected c = new Case1Protected();
//		The field Case1.name is not visible
//		System.out.println(c.name);
		
//		mhnje te publically available nahiye but child class la access kela tr houn jail 
//		tya madhli property access
		
		
		
		
		
		PropertyCAse1 p = new PropertyCAse1();
		
	     System.out.println(p.name);
//	    System.out.println(p.name1); 
	     
	     
		
		
	}

}
