package school.student.info;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		InputOutput in = new InputOutput();
		
		Student s = new Student();
		
		s.setRollNumber(37);
		s.setStudentFullName(" mahesh babu ");
		s.setMarks(in.getmarks());
		s.setSchool(in.getSchoolInfo());
		s.setAddress(in.getAddressArray());
		
		in.printOutput(s);
		
	}

}
