package setter.getter.methods;

public class EntryPoint1 {
	
	public static void main(String[] args) {
		
		Student1 s =new Student1();
		
		s.setName1("Raghav");
		s.setRollNumber1(32);
		s.setSchoolName1("Rajiv Gandhi Highschool");
		
		String name1 = s.getName1();
		String schoolName1 = s.getSchoolName1();
		int rollNumber1 = s.getRollNumber1();
		
		System.out.println(name1);
		System.out.println(schoolName1);
		System.out.println(rollNumber1);
	}

}
