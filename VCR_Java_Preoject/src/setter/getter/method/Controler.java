package setter.getter.method;

public class Controler {

	public static void main(String[] args) {
		
		Student s=new Student();
		
		
		s.setName("Vishakha");
		s.setRollno(101);
		
		Address adr= new Address();
		adr.setLine1("Mukta residency");
		adr.setLine2("Thane");
		
		System.out.println(s.getName());
		System.out.println(s.getRollno());
		System.out.println(adr.getLine1());
		System.out.println(adr.getLine2());
		
		
	}
}
