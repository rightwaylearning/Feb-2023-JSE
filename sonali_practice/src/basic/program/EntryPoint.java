package basic.program;

public class EntryPoint 
{
	Student genrateStudent(int rno,String fname,int age1)
	{
		Student s=new Student();
		s.rollNumber=rno;
		s.firstName=fname;
		s.age=age1;
		
		return s;
	}
	public static void main(String[] arg)
	{
		EntryPoint e=new EntryPoint();
		Student s=e.genrateStudent(101,"Sonali", 23);
		s.PrintStudentInfo();
		
		
		
	}

}
