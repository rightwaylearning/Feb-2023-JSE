package student_info;

public class EntryPoint {
	public static void main(String[] args) {
		InputOutput in = InputOutput();
		Student s = new Student();
		s.setRollNumber(45);
		s.setStudentFullName("Mr.Akash Shirke");
		s.setMarks(in.getmarks());
		s.setSchool(in.getSchoolInfo());
		s.setAddress(in.getAddressArray());
		in.printoutput(s);
	}
}
