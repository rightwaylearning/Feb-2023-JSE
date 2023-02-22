package setter.getter.studentmain;

public class EntryPointStudent {
	
	public static void main(String[] args) {
		
//		Student is user define ref type 
//		s is ref var
		
//		= is assignment operator used for assign value of right to
//		left

//		new is opt used for create object 

//		and last Student?() is one type special method called 
//		Constructor call and semicolon is line terminator statement
		Student s = new Student();
		
		s.setRollNo(32);
		s.setName("Rahul");
		                      Mobile m = new Mobile();
		                      m.setPhoneNo(43343);
		                     
		                      Address adr = new Address();
		                      adr.setLine("Ganesh nagar");
		                      adr.setMob(m);
		s.setAdr(adr);
		
//		and now read method call
		
		String name = s.getName();
		System.out.println(name);
		
		int rollNo = s.getRollNo();
		System.out.println(rollNo);
		
		Address adr2 = s.getAdr();
		String line =adr2.getLine();
		System.out.println(adr2.getLine());
		
		Mobile m2 = adr2.getMob();
		m2.getPhoneNo();// aasa nahi chalnar yat fkt method call
//		hota aahe value store karav lagel nasta direct print karav
//		lagel 
		System.out.println(m2.getPhoneNo());
		
	}

}
