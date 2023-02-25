package array.examples;

public class StudentClient {
	public static void main(String[] args) {
		
		Student []arr= new Student[5];
		//-----------------------------
		
		
		Student s=new Student();
		s.setRollnumber(16);
		s.setName("vish");
		arr[0]=s;
		//===================================
		  
		//Student s1 = new Student(22, "bin");
		//arr[1]=s1;
		
		Student s2= new Student("Liva", 10030);
			arr[1]=s2;
			
			arr[2]=new Student("Chetan",220);
			
			StudentClient.printStudentdata(arr);
	}
	public static void printStudentdata (Student[]arr) {
		 System.out.println(arr[1].getName());
		 System.out.println(arr[1].getRollnumber()); 
		 System.out.println(arr[2].getName());
		 System.out.println(arr[2].getRollnumber());
		 
	}
				
			
			
			
		
	}


