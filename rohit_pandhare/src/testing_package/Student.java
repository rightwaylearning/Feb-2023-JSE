package testing_package;

public class Student {
	
	String name;
	int rollNo;
	int a;
	int b;
	
	public int add() {
		
		int s = a+b;
		return s;
	}
	
	public static void main(String[] args) {
		
		Student s = new Student();
		s.name = "xyz";
		s.rollNo = 12;
		
		System.out.println(s.name);
		System.out.println(s.rollNo);
		
		     int result = s.add();
		     
		     System.out.println(result);
	}

}
