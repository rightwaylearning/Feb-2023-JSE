package circle;

public class Student2 {
	
	public static void main(String[]args) {
		
		CircleArea C2= new CircleArea();
		
		C2.pi =3.14f;
		C2.reduis = 5.1f;
		
		float result = C2.getCircleArea();
		 
		System.out.println(result);
		
	}	
}
