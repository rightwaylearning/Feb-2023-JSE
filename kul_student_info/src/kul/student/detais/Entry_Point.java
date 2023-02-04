package kul.student.detais;

public class Entry_Point {
	public static void main(String[] data) {
		StudentDetails stu = new StudentDetails();
		stu.rollNo=100;
		stu.studentName="Suryakumar";
		stu.schoolName="Royal Public School";
		stu.printStudentInfo();
		Address adr = new Address();
		adr.plotNo=48;
		adr.adrLine1="Alpine Aura Near Bankar vasti";
		adr.adrLine2="Moshi";
		adr.cityName="Pune-400001";
	}

}
