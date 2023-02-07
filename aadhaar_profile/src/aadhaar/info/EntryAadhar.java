package aadhaar.info;

public class EntryAadhar {

	public static void main(String[] args) {
		
		PersonalInfo p = new PersonalInfo();
		
		p.name="Raut Abhishek Sunil";
		p.birthYear=2002;

			
	    Address a = new Address();
	    
	    a.buldingNo="659, sai apartment (main road) ";
	    a.landmark="near central bank of india";
	    a.area="A/p. Kolgaon , Tal. Shrigonda , Dist. Ahmednagar";
	    a.pinCode=413728;
	    
	    p.adr = a;
	    
	    p.info();
	    p.address();
	    
	}
	    
	    
	    
	    
	    
}
