package constructor.special.method;

public class ConstructorCallEntryPoint1 {

	public static void main(String[] args) {
		
//		jar ya paranthesis madhe kahi argument pass nahi kela
//		tr aasa yete 
		
//		The constructor Case1() is undefined
	
		Case1 c = new Case1(43);
		
//		hai khali ka kela karan parat aasa dhakhavla aasta ki
//		The constructor Case1() is undefined
		
//		yacha aarth class madhe constructor aasa nahi
		Case1 c1= new Case1();
		
		c.m1();
	}
}
