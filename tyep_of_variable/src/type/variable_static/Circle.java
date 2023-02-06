package type.variable_static;

public class Circle {
	
	public static float pi; 
	public float redius;

	public float getArea() {
		float area = pi * redius *redius;
		return area;
	}
}
