package type.variables;

public class Student2 {

	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		
		c.pi = 3.14F;
		c.reduis = 2.3F;
		
		float result = c.getCircleArea();
		System.out.println(result);
		
	}
}

// here problem ??
// pi value is common for all object/instance but still we are assigning memory every time to that pi variable.

