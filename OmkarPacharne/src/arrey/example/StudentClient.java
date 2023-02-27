package arrey.example;

public class StudentClient {
	public static void main(String[] args) {
		
		Student [] arr = new Student [4];
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		
		
		Student s =new Student();
		s.setName("omkar");
		s.setRollNumber(1);
		arr[0]=s;
		
		Student s1 =new Student (2 ,"b");
		arr[1]=s1;
		
		
		arr[2] = new Student();
		arr[2].setName("om");
		arr[2].setRollNumber(34);
		
		
		
		arr[3]= new Student();
		s.setName("omkar");
		s.setRollNumber(23);
	
	StudentClient.printStudentData(arr);
	}	
	
	public static void printStudentData(Student[]arr) {
		System.out.println(arr[1].getName());
		System.out.println(arr[1].getRollNumber());
		System.out.println(arr[2].getName());
		System.out.println(arr[2].getRollNumber());
		System.out.println(arr[0].getName());
		System.out.println(arr[0].getRollNumber());
	}
	
}
