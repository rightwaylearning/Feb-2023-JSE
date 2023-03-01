package student;



public class InputOutput {

	public int[] getMarks() {
		int[] arr = new int[3];
		arr[0] = 76;
		arr[1] = 79;
		arr[2] = 86;
		
//		int[] arr2 = {65,34,76};
		
		return arr;
	}
	
	public Address[] getAddress() {
		Address[] address = new Address[2];
	     Address a1 =new Address("ganesh nagar" , " Nagar" ,"SASAR",431602);
	     address[0] = a1;
        
	     Address a = new Address("vijay " , " Nagar" ,"Nan",430000);
	     address[1] = a;
        
//	     Address[] adr = {a1,a};
	     
	     return address;
	}
	
	public School getSchoolDetails() {
		  School school = new School();
		     school.setSchoolName("Mahatma Phule");
		     
		     school.setRegNo("432/343/434/dd");
		                           Address adr = new Address(" Nagar","Near Padma ","KADA",431602);
		     school.setSchoolAddress(adr);

		     return school;
	}
	
	public void printAllData(Student s) {
		
		System.out.println("Student Full name = "+s.getStudentName());
		System.out.println("Student roll No = "+s.getRollNo());
//		System.out.println(s.getAddress());
//		aasa print nahi karta yenar karan ya madhe multiple 
//		address aahet student che tya mule eka madhe print 
//		sop aasa nahi karta yenar

		int[] marks = s.getMarks();
//		System.out.println(marks[0]);
		
		System.out.println("Marks Of Student");
		int i = 0 ;
		 
		while(i<marks.length) {
			System.out.println(marks[i]);
			i++;
		}
		
		System.out.println("<<<<<<<<student Address 1 start>>>>>>>>");
		
	
		System.out.println("<<<<<<<<student Address 1 over>>>>>>>>");

			Address[] address = s.getAddress();		
		System.out.println("Name of City = "+address[0].getCity());
		System.out.println("Address line1 = "+address[0].getLine1());
		System.out.println("Address line2 = "+address[0].getLine2());
		System.out.println("Pincode = "+address[0].getPinCode());
		System.out.println("<<<<<<<<student Address 2 start>>>>>>>>");
		
	     
		System.out.println("Name of City = "+address[1].getCity());
		System.out.println("Address line1 = "+address[1].getLine1());
		System.out.println("Address line2 = "+address[1].getLine2());
		System.out.println("Pincode = "+address[1].getPinCode());

		
		System.out.println("<<<<<<<<student Address 2 over>>>>>>>>");
		
		System.out.println("School Information");
		
		School school = s.getSchool();
		System.out.println("School reg No = " +school.getRegNo());
		
		System.out.println("School Name = "+ school.getSchoolName());
		
		System.out.println("School Address Info");
		
		Address adr =school.getSchoolAddress();
		System.out.println(adr.getLine1());
		System.out.println(adr.getLine2());
		System.out.println(adr.getCity());
		System.out.println(adr.getPinCode());
	}
}
