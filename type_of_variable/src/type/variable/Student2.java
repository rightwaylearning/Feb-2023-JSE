package type.variable;

public class Student2 {
	
	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		
		c.pi = 3.14F;
		c.redius = 2.3F;
		
		float result = c.getCircleArea();
		System.out.println(result);
	}

}
