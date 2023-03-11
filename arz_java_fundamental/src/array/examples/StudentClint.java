package array.examples;

public class StudentClint {

	public static void main(String[] args) {

		Student[] arr = new Student[4];

		// ---------------------------------------------

		Student s = new Student();
            s.setRollNumber(10);
			s.setName("A");
			arr[0] = s;
			
			// ---------------------------------------------
			
			
			Student s1 = new Student(11,"B");
			arr[1] = s1;
			
			// ---------------------------------------------
			
			arr[2] = new Student();
			arr[2].setRollNumber(12);
			arr[2].setName("C");
			
			// ---------------------------------------------
			
			arr[3] = new Student(13,"D");
			
			// ---------------------------------------------
	
			StudentClint.PrintStudentDate(arr);
	}

	
	public static void PrintStudentDate(Student[]arr){
		
		System.out.println(arr[1].getName());
		System.out.println(arr[1].getRollNumber());
		
	}
}
