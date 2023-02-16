package instance.variable;

public class Entrypoint {
public static void main(String[] args) {
		
//		hai static aahe tya mule ekdach declare kela 
		Student.pi = 3.14F;
		
		Student s = new Student();
		s.radius = 12.3F;
		
		float result = s.getMethod();
		
		System.out.println(result);
		
		Student s2 = new Student();
		s2.radius = 22.33F;
		
		float result2 = s2.getMethod();
		
		System.out.println(result2);
	}


}
