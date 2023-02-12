package circle;

public class Student {

	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
				
				c.pi = 3.14f;
				c.radius = 4.5f;
				
				float result = c.getCircleArea();
				System.out.println(result);
	}
}
