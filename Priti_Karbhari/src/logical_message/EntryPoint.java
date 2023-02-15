package logical_message;



public class EntryPoint {
public static void main(String[] args) {
		
		EmployeeInfo e = new EmployeeInfo();
		      e.name = "xyz";
		      e.employeeId = 12;
		      e.companyName = "companyName";
		     e.addr = new Address();
		      e.addr.line1 = "AddressLine1";
		      
		
	    Office o = new Office() ;
//	                             Address a = new Address();
//	                             a.line1 = "xyzline1";
	    o.addr2 =new Address();
	    o.addr2.pincode = 434343;
	     o.infoMsg(e);
	     
	     Address obj2= o.infoAdd();
	     obj2.line1 = "line1Address";
	     
	     
	System.out.println("here we printing Address" + obj2.line1);
	     
	}

}
