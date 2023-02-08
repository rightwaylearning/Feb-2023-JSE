package circle;

public class Student_2 {
	
	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		
		c.pi = 3.14f;
		c.radius = 2.3f;
		
		float result = c.getCircleArea();
		System.out.println(result);
	}

}
