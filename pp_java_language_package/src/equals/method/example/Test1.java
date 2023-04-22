package equals.method.example;

class Student{
	int mathsmarks;
	int sciencemarks;
	public Student(int mathsmarks, int sciencemarks) {
		super();
		this.mathsmarks = mathsmarks;
		this.sciencemarks = sciencemarks;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student s2=(Student)obj;
		
		if(this.mathsmarks==s2.mathsmarks && this.sciencemarks==s2.sciencemarks) {
			return true;
		}
		return false;
	}
	
	
}

public class Test1 {
	
	public static void main(String[] args) {
		Student s1= new Student(80,90);
		Student s2= new Student(80,90);
		Student s3= new Student(90,98);
		
		System.out.println(s1.equals(s2));
		System.out.println(s2.equals(s3));
		
		//-----------------------------------
		
		String str1= new String("hii");
		String str2= new String("hii");
		System.out.println(str1.equals(str2));// true because string equals override is alredy String.class generated
		
		
		StringBuffer br1= new StringBuffer();
		StringBuffer br2 = new StringBuffer();
		System.out.println(br1.equals(br2));//false beacause StringBuffer equals class is not exists so it is false.
		
		
		
		
	}

}
