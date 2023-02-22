package default_constructor;


public class Entrypoint {
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Default values");
		s1.info();
		
		s1.rollNo=26;
		s1.name="Pranali";
		s1.clgName="Raisoni";
		
		System.out.println("\nWith values:");
		s1.info();
	
		
		
				
	}

}
