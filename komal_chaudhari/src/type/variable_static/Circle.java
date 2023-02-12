package type.variable_static;

public class Circle {

	
	public static float pi;
	public float radius;
	
	public float getArea()
	{
		float area = pi * radius * radius;
		return area;
	}
}
