package type.variables;

public class Student1 {

	public static void main(String[] args) {
	  // object is nothing but instance here 2 instance variable
		CircleArea c = new CircleArea();
		
		c.pi =3.14f;
		c.reduis =4.5f;
		
		float result = c.getCircleArea();
		System.out.println(result);
	}
}
