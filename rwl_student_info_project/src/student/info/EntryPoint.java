package student.info;



public class EntryPoint {

	public static void main(String[] args) {
		
		InputOutput in =new InputOutput();
		
      // target :- to add 2 student details 
		
		Student s = new Student();
		
		s.setRollNumber(23);
		s.setStudentFullName("Mr. Rangnathan madhavan");
		s.setMarks(in.getMarks());
		s.setSchool(in.getSchoolInfo());
		s.setAddress(in.getAddressArray());
		
		in.printOutput(s);
		
	}
}
