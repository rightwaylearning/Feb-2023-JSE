package constructor.example;

public class StudentEntry
{
	public static void main(String[] args) 
	{
		Student s=new Student();
		s.setRollNumber(101);//value is give to set method
		s.setName("Snehal");
		System.out.println(s.getRollNumber());
		System.out.println(s.getName());
		
		// give value to constructor
		Student s1=new Student(1,"Sonali");
		System.out.println(s1.getRollNumber());
		System.out.println(s1.getName());
	}

}
