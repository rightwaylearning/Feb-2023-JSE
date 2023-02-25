package array_java.a23_02;

public class StudentClient {

	public static void main(String[]args) {
		
		Student[] arr = new Student[4];
		
		//=====================================
		Student s = new Student();
		s.setRollNumber(10);
		s.setName("Vishwas");
		arr[0] = s;
		
		//===========================
		
		Student s1 = new Student(12,"kajal");
		arr[1] = s1;
		
		//==============
		
		arr[2] = new Student();
		arr[2].setRollNumber(14);
		arr[2].setName("Ramat");
		
		//===================
		
		arr[3] = new Student(17,"shaman");
		
		StudentClient.printStudentData(arr);
		
		
		
	}
	public static void printStudentData(Student [] arr) {
		
		System.out.println(arr[1].getRollNumber());
		System.out.println(arr[1].getName());
		System.out.println(arr[0].getRollNumber());
		System.out.println(arr[0].getName());
		System.out.println(arr[3].getRollNumber());
		
		
	}
	
	
	
}
