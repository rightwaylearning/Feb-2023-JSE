package instance_static_variable;

public class Circle {
	public float radius;
	public static  float pi; //static variable declaration.
	
	public void Carea()
	{
		float area= pi*radius*radius;
		System.out.println(area);
		//return area;
		
	}

}
