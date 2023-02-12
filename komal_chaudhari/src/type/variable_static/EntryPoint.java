package type.variable_static;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		
		Circle.pi = 3.14F;
		
		Circle c1 = new Circle();
		c1.radius = 3.4F;
		float r1 = c1.getArea();
		System.out.println(r1);

		
		Circle c2 = new Circle();
		c2.radius = 4.5F;
		float r2 = c2.getArea();
		System.out.println(r2);
	}
}