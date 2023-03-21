package type.of.variable.statics;

public class EntryPoint {
	public static void main(String[]data) {
		
		Student s=new Student();
		Student.pi=3.14f;
		s.radius=12f;
		
		float r=s.getCircle()	;	
		
		System.out.println(r);
		
	}

}
