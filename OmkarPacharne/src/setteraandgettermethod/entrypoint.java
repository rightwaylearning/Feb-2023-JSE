package setteraandgettermethod;



public class entrypoint {
	
	
public static void main(String[] args) {
	student s = new student ();
	s.setName("omkar");
	s.setRollNumber(123212);
	
	 
	 System.out.println(s.getName());
 
 System.out.println(s.getRollNumber());
	
	
	Address adr = new Address ();
	adr.setLine1("baburav pacharne nagar");
	adr.setLine2("shirur pune");
	adr.setPincode(23232);
	
	 String w= adr.getLine1();
	String e=adr.getLine2();
	int j= adr.getPincode();
	
	System.out.println(w);
	System.out.println(e);
	System.out.println(j);
}
}


