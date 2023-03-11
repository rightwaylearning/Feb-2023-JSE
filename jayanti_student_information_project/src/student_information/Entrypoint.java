package student_information;

public class Entrypoint {
	
	public static void main(String[] args) {
		InputOutput in = new InputOutput();
		
		// target :- to add 2 student details 
		
		Student s= new Student();
		
		s.setRollNumber(1);
		s.setStudentFirstName("Pranali");
		s.SetStudentLastName("Rokade");
		s.setMarks(in.getmarks());
		s.setSchool(in.getSchoolInformation());
		s.setAddress(in.getAddressArray());
		
		in.printOutput(s);
		

		
		
	}

}
