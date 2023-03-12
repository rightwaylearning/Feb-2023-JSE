package control.flow;

public class StudentController {public static void main(String[] args) {
	
	Student[] arr = new Student[3];
	
	// 0th index value
	Student s= new Student(11, "A");
	arr[0] = s;
	
	// 1st index value
	Student s1= new Student();
	s1.setRollNumber(22); s1.setName("Mahesh");
	arr[1] = s1;
	
	// 2nd index value		
	arr[2] = new Student(33,"C");
	
	
	int i = 0;
	
	while(i < arr.length) {
		
		System.out.println(arr[i].getName());
		System.out.println(arr[i].getRollNumber());
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
		
		i++;
	}
	
	
}
	
	

}
