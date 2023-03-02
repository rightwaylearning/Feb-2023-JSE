package student_info;

public class InputOutput {
	
	public int[] getStudentMarks() {
		int[]marks=new int(5);
		        marks[0]=41;
				marks[1]=48;
				marks[2]=32;
				marks[3]=35;
				marks[4]=41;
				 return marks;
	}
	   
	
	public Student[] getSchoolinfo() {
		public School getschoolinfo() {
			School s = new School();
			s.setRegNo("U/YUP/15455/DGWD");
			s.setSchoolName("H.B.S.");
			Address adr = new Address("SR no 15", "Plot no 15 alandi pune road", 412105);
			s.setAdr(adr);

			return s;
	}
		public Address[] getaddress() {
			Address adr1 = new Address("sr no29/2", "Plot no 45", 789456);
			Address adr2 = new Address("sr no20/2", "Plot no 46", 784756);
			Address[] adr = { adr1, adr2 };
			return adr;


}
