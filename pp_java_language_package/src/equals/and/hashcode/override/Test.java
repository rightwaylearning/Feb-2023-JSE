package equals.and.hashcode.override;

class Student{
	public String name;
	public Integer rollNumber;
	
	
	public Student(){
		
	}


	public Student(String name, Integer rollNumber) {
		super();
		this.name = name;
		this.rollNumber = rollNumber;
	}
	
	@Override
	public int hashCode() {
		return this.name.hashCode() + this.rollNumber.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof Student) {
			Student s=(Student)obj;
			if(this.name.equals(s.name) && this.rollNumber.equals(s.rollNumber)) {
				return true;
			}
		}
		return false;
	}	
	
}

public class Test {
	public static void main(String[] args) {
		Student s = new Student("Abhishek",124);
		
		Student s1 = new Student("Abhishek",124);
		
		System.out.println(s.equals(s1));//false without override method
		
		int h1= s.hashCode();
		int h2 = s1.hashCode();
		System.out.println(h1 == h2); // false without override method
		System.out.println(h1);
		System.out.println(h2);

		// -------------------------------------------------------

		Integer i = new Integer(1000);

		Integer i1 = new Integer(1000);

		System.out.println(i.equals(i1)); // true

		System.out.println(i.hashCode() == i1.hashCode()); // true

		
	}
	

}
