package practice.session;

public class EntryPoint {
	public static void main(String[] args) {
		
		 Case2 c1 = new Case2();
	    
		c1.a1 = 32;
		
		Case2.b = 44; //static var getting only one time memory
		
		Case2.c = new Case1();
		
		Case2.c.a = 3233;
		
		Case2.c.m2();  //asa lihu nahi shakt chukicha aahe 
		                     
		Case2.c.z = 3244; // static var static method madhe access
//		karu nahi shaktoh
		
		
		
		
	

	}
}
