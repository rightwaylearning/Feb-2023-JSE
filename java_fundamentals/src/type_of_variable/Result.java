package type_of_variable;

public class Result {
	public static void main(String[] data) {

		CircleArea c = new CircleArea();
		c.pi = 3.14f;
		c.radius = 20f;
		float f = c.getCircleArea();

		System.out.println(f);

	}

}
