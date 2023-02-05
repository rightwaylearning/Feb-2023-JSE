package m.java;



public class EnteryPointJava {

	
	
	
public static void main(String[] args) {
		
		Ciecle.pi = 3.14F; // static variable have single copy of memory
		
		Ciecle c1= new Ciecle();
		c1.redius = 3.4F;
		float r1 = c1.getArea();
		System.out.println(r1);
		
		
		Ciecle c2 = new Ciecle();
		c2.redius = 5.6F;
		float r2 = c2.getArea();
		System.out.println(r2);
		
}
}