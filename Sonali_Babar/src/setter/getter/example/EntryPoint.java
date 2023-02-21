package setter.getter.example;

public class EntryPoint

{
	public static void main(String[] args)
	{
		Student s=new Student();
		
		s.setRollNumber(101);
		
		int Rno = s.getRollNumber();
		System.out.println(Rno);
		
		s.setFirstName("Sonali");
		
		String fName=s.getFirstName();
		System.out.println(fName);
		
		s.setAge(21);
		int age1=s.getAge();
		System.out.println(age1);

		
		
		
		
		
	}

}
