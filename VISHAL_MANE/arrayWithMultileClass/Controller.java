package arrayWithMultileClass;

public class Controller {
	public static void main(String[] args) {
		Student[] array = new Student[3];
		// -------------------------------
		Student array1 = new Student();

		array1.setRollNo(1);
	    System.out.println("Roll No:"+array1.getRollNo());
	//-----------------------------------------------------------	
		array1.setName("sayali");
		System.out.println("Name:"+array1.getName());
		
	//----------------------------------------------------------
	
		DataInIt d=new DataInIt(); 
		array1.setMarks(d.getmarks());
		d.displaymarks(array1);
		
		
   //-------------------------------------------------------
		Address address=new Address("R.K.Complex", "Rankala","Kolhapur", 12345);
		array1.setAdr(address);
		System.out.println("Home Address:");
		
		Address adr1 = array1.getAdr();
		System.out.println("Line1:"+adr1.getLine1());
		System.out.println("Line2:"+adr1.getLine2());
		System.out.println("City:"+adr1.getCity());
		System.out.println("PinCode:"+adr1.getPinCode());
	//----------------------------------------------------------------------
		 Address address1=new Address("phase 1","hinjwadi","pune", 87545);
		 School school=new School(24567, "vck",address1); 
		 array1.setSchool(school);
		 System.out.println("College Details:");
		 School school2=array1.getSchool();
		 System.out.println(school2.getRegNo());
		 System.out.println(school2.getName());
		 System.out.println("College Address:");
		 System.out.println(address1.getLine1());
		 System.out.println(address1.getLine2());
		 System.out.println(address1.getCity());
		 System.out.println(address1.getPinCode());
		 
		

		// ------------------------------------------------------

		
	}

}
