package student.info;

public class EntryPoint {

	public static void main(String[] args) {
		
		StudentDetails d = new StudentDetails();
	  
		  d.name="xyz";
		  d.rollNo = 13;
//		                     Address a1= new Address();
//		                     a1.line1 = "line1";
//		                     a1.line2 = "line2";
		  d.addr = new Address();
		  d.addr.line1 = "line1";
		  d.addr.line2 ="line2";
		  
//		  StudentDetails s = d.info();
//		  s.name = "name";
		  
//		  Address a2 =d.infoAdd();
//		  a2.line1 = "line2";
		
		  
		  System.out.println(d.name);
		  System.out.println("so this is address of line1 =" + d.addr.line1);
	}
}
