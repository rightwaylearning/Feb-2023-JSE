package setter.getter.real.example;

public class EntryPoint {
	public static void main(String[] args) {

		Employee e = new Employee();
		
		e.setEmpId(101);
		e.setName("Sonali");

		Address adr = new Address(); // 
		adr.setLine1("Gorakshanath Nagar");
		adr.setLine2("Ahmednagar");
		adr.setPin(424001);

		e.setAdr(adr);
		
        System.out.println("Employee Information"); 
		System.out.println("EmpId :" + e.getEmpId());
		System.out.println("EmpName :" + e.getName());

		Address adr1 = e.getAdr();
		System.out.println("Line1 : " + adr1.getLine1());
		System.out.println("Line2 : " + adr1.getLine2());
		System.out.println("Pincode :" + adr1.getPin());
		
		System.out.println("*******************************************************");
		
		System.out.println("Student Information");
		Student s=new Student();
		s.setRollNumber(11);
		s.setStudName("Mayur");
		s.setAge(21);
		
		System.out.println("RollNumber "+ s.getRollNumber());
		System.out.println("Name "+ s.getStudName());
		System.out.println("Age "+ s.getAge());
		

	}

}
