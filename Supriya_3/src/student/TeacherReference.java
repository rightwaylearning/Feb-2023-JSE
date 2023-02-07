package student;

public class TeacherReference {
	Student generateStudent(int rollNumber,String name,String lastName)
	{
		Student s =new Student();
		s.name=name;
		s.rollNumber=rollNumber;
		s.lastName=lastName;
return s;		
	}

}
