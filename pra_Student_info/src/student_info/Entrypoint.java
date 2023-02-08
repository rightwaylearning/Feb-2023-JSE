package student_info;

public class Entrypoint {
	
	public static void main(String[] args) {
		Student s= new Student();
		s.rollNumber=22;
		s.StudentName= "Prathamesh Pawar";
		s.SchoolName="Kavi Morophant baramati";
		s.studentAge= 15;
		s.studentDivision="D";
		
		 Address a= new Address();
		 a.line1="Sainagar,Jalochi road";
		 a.line2="Bhigwan Road, Baramati";
		 a.pincode=413102;
		 
		 s.adr=a;
	
		 s.studentInfo();
		 s.studentAddress();
	}

}
