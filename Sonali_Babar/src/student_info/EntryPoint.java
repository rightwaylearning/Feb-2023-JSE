package student_info;

public class EntryPoint
{
	public static void main(String[] data )
	{
		TeacherReference t=new  TeacherReference();
		Student s=t.generateStudent(101, "Sonali", "Babar",22, "Bhingar", 75, "7058194522");
		
		s.PrintfStudentInformation();
	}

}
