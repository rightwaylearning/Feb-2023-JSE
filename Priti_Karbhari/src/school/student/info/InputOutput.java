package school.student.info;

public class InputOutput {
	
	 public int[] getmarks() {
		 
		 int[] arr = new int[3];
		 arr[0] =10; 
		 arr[1] =20; 
		 arr[2] =30;
		 return arr;
	 }
	 
	  Address[] getAddressArray() {
		  
		  Address adr1 = new Address( "abc-3798", "mg road", "pune", 987066);
		  Address adr2 = new Address("abc-7890", "opt road", "pune", 987066);
		  Address[] adr = {adr1 , adr2};
		  return adr;
		  
		 }
	  
	  School getSchoolInfo() {
		  School s = new School();
		  s.setRegNo("37/98/68/P");
		  s.setSchoolName("lbsv");
		  Address adr = new Address("sai heritage", "fc road" , "pune" ,411028 );
		  s.setSchoolAddress(adr);
		  return s;
	  }
	   
	  public void printOutput(Student s) {
		  
		  System.out.println("Roll Number" +  s.getRollNumber());
		  System.out.println("Full Name"  +  s.getStudentFullName());
		  
		  int[] marks = s.getMarks();

			System.out.println("Marks Of Student");
			int i = 0 ;
			 
			while(i<marks.length) {
				System.out.println(marks[i]);
				i++;
			}
			
			System.out.println("*****Student Address1*****"); 
			Address[] address = s.getAddress();
			System.out.println(" Name of city - " +  address[0].getCity());
			System.out.println(" Address line1 - " +  address[0].getLine1());
			System.out.println(" Address line2 - " +  address[0].getLine2());
			System.out.println(" pincode -" +  address[0].getPincode());
			
			System.out.println("*****Student Address2*****");
			
			System.out.println("Name of city - "+ address[1].getCity());
			System.out.println("Address line1 - "+ address[1].getLine1());
			System.out.println("Address line2 - "+ address[1].getLine2());
			System.out.println("pincode - "+ address[1].getPincode());
			
			System.out.println("***** Student Address Over*****");
			
			System.out.println("<<<<<School Information>>>>>");
			
			School school = s.getSchool();
			System.out.println("School reg No = " +school.getRegNo());
			
			System.out.println("School Name = " + school.getSchoolName());
			
			System.out.println("<<<<<<School Address Info>>>>>");
			
			Address adr = school.getSchoolAddress();
			System.out.println(adr.getLine1());
			System.out.println(adr.getLine2());
			System.out.println(adr.getCity());
			System.out.println(adr.getPincode());
			
			
			
			

		 
		  
	  }

}
