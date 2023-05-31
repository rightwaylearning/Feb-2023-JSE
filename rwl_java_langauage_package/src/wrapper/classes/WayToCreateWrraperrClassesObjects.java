package wrapper.classes;

import java.awt.print.Book;

public class WayToCreateWrraperrClassesObjects {

	public static void main(String[] args) {
		// there are 8 primitive & >>> 8 wrapper classes
		// if you want to create any wrapper class object required primitive as input
	
	    Integer i =Integer.valueOf(10);  // Integer i = 10; 
	    
	    
	    Double d = Double.valueOf(10.10); // Double d = 10.10;
	    
	    
	    Boolean b = Boolean.valueOf(true); // Boolean b = true;
	    
	    
	    Character ch = Character.valueOf('C'); // Character ch = 'C';
	    
	    // in java all wrapper classes have valueOf() method to generate object but required input to valueOf() method is primitive
	    
	//-----------------------------------------------------------------------------------------------------------
	    
	  // following 2 type of constructor are there in every wrapper class to create object
	    
	   Integer i1 = new Integer(10); // Integer i1 = new Integer(int i);    
	    
	   Integer i2 = new Integer("10"); // Integer i1 = new Integer(String i); 
	
	
	   Long g = new Long(47647L); // Long l = new Long(long l)
	   Long g1 = new Long("47647");
	   
	   
	   Character ch2 = new Character('A');
	   //Character ch3 = new Character("A");
	   
	   Boolean b11 = new Boolean(true);
	   
	   Boolean b12 = new Boolean("sachin");
	   
	   
	   System.out.println(b12);
	   
	   Integer j = 10;
	   Integer k = 20;
	   
	   System.out.println(j.equals(k));
	   
	   
	}
}
