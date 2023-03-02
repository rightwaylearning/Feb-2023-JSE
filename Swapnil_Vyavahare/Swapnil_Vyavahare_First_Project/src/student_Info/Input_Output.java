package student_Info;

public class Input_Output {

	public int[] getStudentMarks() {
		int[] marks = new int[6];
		marks[0] = 35;
		marks[1] = 36;
		marks[2] = 37;
		marks[3] = 38;
		marks[4] = 39;
		marks[5] = 40;

		// secomd way of array declaration

		// int [] mark = {10,20,30,40,50};

		return marks;
	}

	public School getschoolinfo() {
		School s = new School();
		s.setRegNo("U/YUP/15455/DGWD");
		s.setSchoolName("Swami Samarath");
		Address adr = new Address("SR no 15", "Plot no 15 alandi pune road", 412105);
		s.setAdr(adr);

		return s;

	}

	public Address[] getaddress() {
		Address adr1 = new Address("sr no29/2", "Plot no 45", 789456);
		Address adr2 = new Address("sr no20/2", "Plot no 46", 784756);

		// first way to add adress in array

//		Address[] ad = new Address[2];
//		ad[0] = adr1;
//		ad[1] = adr2;

		// second way to add adress in array

		Address[] adr = { adr1, adr2 };
		return adr;

	}

	public void printOutput(Student s) {

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Full Name   -" + s.getName());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		System.out.println("RollNumber  -" + s.getRollNumber());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		System.out.println("Schhol Information");

		System.out.println("Reg No  -" + s.getSchool().getRegNo());
		System.out.println("School Name  -" + s.getSchool().getSchoolName());
		System.out.println("line 1  -" + s.getSchool().getAdr().getLine1());
		System.out.println("line 2  -" + s.getSchool().getAdr().getLine2());
		System.out.println("Pin code  -" + s.getSchool().getAdr().getPin());

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println("Student Marks");

		int[] marks = s.getMarks();
		int i = 0;
		while (i < marks.length) {
			System.out.println(marks[i]);
			i++;
		}

		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

	}

}
