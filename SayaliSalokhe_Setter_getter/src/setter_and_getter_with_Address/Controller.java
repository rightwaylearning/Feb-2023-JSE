package setter_and_getter_with_Address;

public class Controller {
	public static void main(String[] args) {
		Student s=new Student();
		
		//Assign value to Student info
		s.setRoll_No(1);
		s.setName("sayali");
		Address a=new Address();
		
		//Assign value to Address info
		a.setLine1("sumeru");
		a.setLine2("hinwadi");
		a.setPin_Code(3578);
		s.setAdr(a); //assing value to Address in Stuent class
		
		//Read value from to Student class
		int roll_No=s.getRoll_No();
		String name=s.getName();
		
		//Read value from to Address class
		String Line1=a.getLine1();
		String Line2=a.getLine2();
		int pinCode=a.getPin_Code();
	    s.getAdr();
	    Address adr=a;
	    System.out.println(roll_No);
	    System.out.println(name);
	    System.out.println(a);
	    
	}
	
	

}
