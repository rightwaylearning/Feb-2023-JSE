package constructor.use.typeofmethod;

public class EntryPointStudent {
	int i;
	public static void main(String[] args) {
		
//		System.out.println(i);
//		Cannot make a static reference to the non-static field i
		
//		constructor nahi ghetla tr value assign karav lagel
//		fkt etkach difference aahe
		
//		parameterized constructor and zero parameterized constructor
//	    mhnjech default constructor doghancha use ekach aahe
		
		
		Student s = new Student(32,"rahul",new Address());
		s.getName();
		
		                  Address adr = new Address();
		                  adr.setLine1(544444);
		s.setAdr(adr);
		
		s.setName("vijay");
		s.getRollNo();
		
		s.setName("digvijay");
		
		Address adr2= s.getAdr();
		adr2.getLine1();
		
		System.out.println(adr2.getLine1());
		
		System.out.println(s.getName());
		System.out.println(s.getRollNo());

	System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
	
//		zero parameteried constructor doghancha use ekach aahe
		Student s1 = new Student();
		s1.setName("ramesh");
		s1.setRollNo(43);
		
		System.out.println(s1.getName());
		
		
	}

}
