package student.info.project;

public class EntryPoint 
{
	public static void main(String[] args) {
		
		InputOutput in=new InputOutput();
		//target: to add 2 student details
		
		Student s=new Student();
		s.setRollNumber(11);
		s.setStudentName("Sonali Ravindra Babar");
		s.setMarks(in.getMarks());
		s.setAddress(in.getAddress());
		s.setSchool(in.getSchoolInfo());
		
		in.printOutput(s);
		
		
		
	}

}
