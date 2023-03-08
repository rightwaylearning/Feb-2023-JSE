package array_example;

public class Controller {
	
	public static void main(String[] args) {
		
	
	
	Student[] arr = new Student[3];
	
	// 0th index value
	Student s = new Student(101,"Ranjeet",75.10);
	arr[0] = s;
	
	System.out.println(".........................");
	
	// 1 st index value
	arr[1] = new Student(102,"Archana",87.54);
	
	
	
	
	// 2nd index value
	
	Student s1 = new Student();
	s1.setRollNumber(105);
	s1.setName("Nilam");
	s1.setMark(55.45);
	arr[2] = s1;
	
	
	
	
	int i = 0;
	while(i<arr.length) {
		System.out.println(arr[i].getRollNumber());
		
		System.out.println(".........................");
		
		System.out.println(arr[i].getName());
		
		System.out.println(".........................");
		
		System.out.println(arr[i].getMark());
		
		
		i++;
	}
	
	}	
	
	

}