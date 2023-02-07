package student_info;

public class TeacherReference 
{
	Student  generateStudent(int rno,String fname,String lname,int age1,String address1,int marks1,String mobNumber1)
	{
	Student s=new Student();
	s.rollNumber=rno;
	s.studFirstName=fname;
	s.studLastName=lname;
	s.age=age1;
	s.address=address1;
	s.marks=marks1;
	s.mobNumber=mobNumber1;
	
	return s;
	}

	

}
