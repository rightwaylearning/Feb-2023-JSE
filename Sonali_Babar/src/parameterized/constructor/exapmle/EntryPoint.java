package parameterized.constructor.exapmle;

public class EntryPoint 
{
	public static void main(String[] args) 
	{
		Student s=new Student(111,"Sonali Babar",23);
		
		
		
		System.out.println("RollNumber "+s.getRollNumber());
		System.out.println("Name "+s.getName());
		System.out.println("Age "+s.getAge());
		
		System.out.println("**********************************");
		
		s.setName("Snehal");
		s.setRollNumber(101);
		s.setAge(20);
		
		System.out.println("RollNumber "+s.getRollNumber());
		System.out.println("Name "+s.getName());
		System.out.println("Age "+s.getAge());
		
				
		
	}

}
