package type_variable_static;

public class Circle_EntryPoint {
	
	public static void main (String[] args) {
		
		Circle.pi= 4.12F;
		
		Circle c1 = new Circle();
		c1.redius = 3.8F;
		float r1 = c1.getArea();
		System.out.println(r1);
		
		
	}

}
