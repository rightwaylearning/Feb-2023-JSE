package type.variable;

public class Student1 {
	
	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		
		c.pi =3.14f;
		c.redius =4.5f;
		
		float result = c.getCircleArea();
		System.out.println(result);
		
	}

}
