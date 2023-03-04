package student;



public class EntryPoint {

	public static void main(String[] args) {
		
		InputOutput in = new InputOutput();

		
		Student S= new Student();
        S.setRollNo(23);
	S.setStudentName("umesh ");
	S.setMarks(in.getMarks());
	S.setSchool(in.getSchoolDetails());
    S.setAddress(in.getAddress());

    in.printAllData(S);

	}
	

	
	
	
}
