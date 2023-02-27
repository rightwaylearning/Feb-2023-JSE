package array.example;

public class StudentClient {
	public static void main(String[] args) {

		Student[] arr = new Student[4];

		Student s1 = new Student(101, "Sonali");
		arr[0] = s1;

		Student s2 = new Student();
		s2.setRollNumber(102);
		s2.setName("Snehal");
		arr[1] = s2;

		arr[2] = new Student();
		arr[2].setRollNumber(103);
		arr[2].setName("Radhika");

		arr[3] = new Student(104, "Sakshi");

		StudentClient.printStudentData(arr);

	}

	public static void printStudentData(Student[] arr) {
		System.out.println(arr[0].getRollNumber());
		System.out.println(arr[0].getName());

		System.out.println(arr[1].getRollNumber());
		System.out.println(arr[1].getName());

		System.out.println(arr[2].getRollNumber());
		System.out.println(arr[2].getName());

		System.out.println(arr[3].getRollNumber());
		System.out.println(arr[3].getName());

	}

}
