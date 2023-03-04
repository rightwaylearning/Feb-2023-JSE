package student_Info;

public class Student_Controller {

	public static void main(String[] args) {

		Input_Output i = new Input_Output();

		Student s = new Student();
		s.setName("Swapnil Satyavan Vyavahare");
		s.setRollNumber(20);

		// First way to access marks

//		int[] marks = i.getStudentMarks();
//		s.setMarks(marks);

		// second way to access marks
		s.setMarks(i.getStudentMarks());

		s.setSchool(i.getschoolinfo());
		s.setAdr(i.getaddress());

		i.printOutput(s);

	}

}
