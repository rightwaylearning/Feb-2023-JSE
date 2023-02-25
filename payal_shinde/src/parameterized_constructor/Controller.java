package parameterized_constructor;

public class Controller {
	
		public static void main(String[] args) {
			
			Student s= new Student();
			s.setName("Vijay");
			s.setName("Vijay setupati");
			s.setRollNumber(23);
			
			System.out.println(s.getName());
			System.out.println(s.getRollNumber());
			
			//----------------------------------
			
			Student s1 = new Student("Vijay raghavan",24); //constructor 
			s1.setRollNumber(26);                          //constructor override
			
			System.out.println(s1.getName());
			System.out.println(s1.getRollNumber());
			
		}

	}


