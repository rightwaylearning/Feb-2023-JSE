package student1;

public class Controller {

	public static void main(String[] args) {
		
		Student_info s = new Student_info();
		  s.rollNumber = 22;
		  s.bloodGroup = "A+ve";
		  s.studentName = "Tejas";
		  s.mobileNumber =7518036818l; 
		  
		  s.printDetails();
		  
		  Address adr = new Address();
		  
		    adr.Line1 = "At. Post Moshi";
		    adr.Line2 = "Alandiroad, Alhatwadi, Moshi";
		    adr.Pincode = 412105;
		 
		
		
	}
	
	
}
