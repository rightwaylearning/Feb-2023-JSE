package equals.and.hashcode.override;

class Student {

	private Integer rollNumber;
	private String name;

	public Student() {
	}

	public Student(Integer rollNumber, String name) {
		this.rollNumber = rollNumber;
		this.name = name;
	}
	
	@Override
	public int hashCode() {
		return this.rollNumber.hashCode() + this.name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj instanceof Student) {
			Student s = (Student) obj;

			if (this.rollNumber.equals(s.rollNumber) && this.name.equals(s.name)) {
				return true;
			}
		}
		return false;
	}

}

public class Test {

	public static void main(String[] args) {

		Student s = new Student(11, "Sandesh");

		Student s1 = new Student(11, "Sandesh");

		System.out.println(s.equals(s1)); // false

		int h1= s.hashCode();
		int h2 = s1.hashCode();
		System.out.println(h1 == h2); // false
		System.out.println(h1);
		System.out.println(h2);

		// -------------------------------------------------------

		Integer i = new Integer(1000);

		Integer i1 = new Integer(1000);

		System.out.println(i.equals(i1)); // true

		System.out.println(i.hashCode() == i1.hashCode()); // true

	}
}
