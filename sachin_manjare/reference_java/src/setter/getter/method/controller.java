package setter.getter.method;

public class controller {
	
	public static void main(String[]data) {
		
		
		student s= new student ();
		s.setRollName(10);
		s.setName("sachin");
		int rollNumber=s.getRollName();
		String name=s.getName();
		
		System.out.println(s.getRollName());
		System.out.println(s.getName());
		
		
	}

}
