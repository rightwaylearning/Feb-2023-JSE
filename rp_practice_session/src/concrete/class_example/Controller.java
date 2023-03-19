package concrete.class_example;

import static concrete.class_example.Parent.m3;

public class Controller {

	
	public static void main(String[] args) {
		
		
		Parent p = new MethodOverride();
		
		p.m1();
		p.m2();
		m3();
		
//		static method la ekadach memory bhete but object madhe bhetat nahi tya mule direct hote call
		
	}
	
}
