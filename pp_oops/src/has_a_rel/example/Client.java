package has_a_rel.example;

public class Client {

	public static void main(String[] args) {
		Student s = new Student();
		s.no= 15;
		s.name= "vaishali";
		s.age = 24;
		
		s.m1();
			
	}
}
//memory manager
//1] object >>>> heap
//2] method memory (local variable memory) >>> stack
