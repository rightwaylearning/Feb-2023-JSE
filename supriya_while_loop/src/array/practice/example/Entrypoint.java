package array.practice.example;

public class Entrypoint {

	public static void main(String[] args) {

		Student[] arr = new Student[3];

		Student s = new Student();
		s.setRollNumber(10);
		s.setsName("Advik");

		arr[0] = s;

		// +++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		Student s1 = new Student(20, "Rahul");
		arr[1] = s1;

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		Student s2 = new Student();
		s.setRollNumber(30);
		s.setsName("Ganesh");

		// ++++++++++++++++++++++++++++++++++++++++++++++++++++++++++

		Entrypoint.printStudentData(arr);
	}

	public static void printStudentData(Student[] arr) {
		System.out.println((arr[0].getRollNumber()));
		System.out.println((arr[0].getsName()));
		
		
		System.out.println((arr[1].getRollNumber()));
		System.out.println((arr[1].getsName()));

		
		System.out.println((arr[2].getRollNumber()));
		System.out.println((arr[2].getsName()));


	}

}