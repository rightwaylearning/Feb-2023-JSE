package equals.method.example;

class Student{
	int mathasMarks;
	int scienceMarks;
	public Student(int mathasMarks, int scienceMarks) {
		super();
		this.mathasMarks = mathasMarks;
		this.scienceMarks = scienceMarks;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Student s2= (Student)obj;
		
		if(this.mathasMarks == s2.mathasMarks && this.scienceMarks == s2.scienceMarks) {
			return true;
		}
		return false;
	}
}


public class Test1 {

	public static void main(String[] args) {
		
		Student s1= new Student(80, 90);
		Student s2= new Student(80, 90);
		Student s3= new Student(80, 91);
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		//---------------------------------------
		
		String str1= new String("hi");
		String str2= new String("hi");
		System.out.println(str1.equals(str2));
		
		
		StringBuffer br1= new StringBuffer("hi");
		StringBuffer  br2 = new StringBuffer("hi");
		System.out.println(br1.equals(br2));
		
		
		
	}
}
