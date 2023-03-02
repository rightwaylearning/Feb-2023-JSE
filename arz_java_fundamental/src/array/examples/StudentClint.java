package array.examples;

public class StudentClint {
	
	public static void main(String[] args) {
		
		Student[] arr = new Student[4];
		
  //---------------------------------------------------------------------	
		
		Student s = new Student();
			s.setRollNumber(10);
			s.setName("A");
			
		arr[0] = s;
		
  //______________________________________________________________________
		
		Student s1 = new Student(11,"B");
		arr[1] = s1;
		
  //---------------------------------------------------------------------
		arr[2] = new Student();
		arr[2].setRollNumber(12);
		arr[2].setName("C");
		    
			
 //______________________________________________________________________		
			
		arr[3] = new Student(13,"D");	
			
		StudentClint.printStudentData(arr);	
	}

	   public static voide printStudentData(Student[]) {
		   
	}
}
