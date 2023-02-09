package p1;

public class TeacherReference {
	
	Student generateStudent(int id,String name,double marks, String add) {
		Student s1=new Student();
		s1.rollNo=id;
		s1.name=name;
		s1.marks=marks;
		s1.add=add;
		
		return s1;
	}
	
	
}
