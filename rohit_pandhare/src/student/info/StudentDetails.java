package student.info;

//this is the standard rule 

public class StudentDetails {
	
	String name;
	int rollNo;
	Address addr;
	
	public StudentDetails info() {
		
		StudentDetails s =new StudentDetails();
		
		return s;
	}

	public Address infoAdd() {
		
		Address a = new Address();
		return a;
	}
	
}
