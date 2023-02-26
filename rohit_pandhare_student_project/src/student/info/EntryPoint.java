package student.info;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.setRollNo(32);
		s.setStudentName("Ravi");
		
	     InputOutput in = new InputOutput();
		
	     int[] marks = in.getMarks();	     
		
	     s.setMarks(marks);
//	     aasa lihita yet nahi karan method madhe return type dyavha lagte
//	     return must karav lagel mg ch te store karta yeil
	
	     
	     s.setAddress(in.getAddress());
	     
	   	     
	     s.setSchool(in.getSchoolDetails());
	     
	     in.printAllData(s);
	   
	    
	}

}
