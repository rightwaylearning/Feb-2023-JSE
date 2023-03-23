package reusability_inheritance;

public class Controller {

	public static void main(String[] args) {
		
//		parent child relationship la kas kay inheritance aahe karan parent madhle 
//		method aapn parat use karu shaktoh child madhe tyalach reusability mhntat
		
		Child c = new Child();
		
		c.m1();
		System.out.println("<<<<<<<<>>>>>>>>");
		
		c.m3(c);
		
		System.out.println("<<<<<<>>>>>>>");
		
		c.m4();
		
		System.out.println("<<<<<<<>>>>>>>>");
		
		c.m5(32,43,c);
		
		
	}
	
}
