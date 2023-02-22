package constructor;

public class EntryPara {
	
	public static void main(String[] args) {
		
		Parmeterized p =new Parmeterized();
		p.setName("abhi");
		p.setRollNumber(23);
		p.setRollNumber(101); // overide 
		
		String name = p.getName();
		int rollNumber = p.getRollNumber();
		
		System.out.println(name);
		System.out.println(rollNumber);
		
		Parmeterized p1 =new Parmeterized("vijay",48);
		
		System.out.println(p1.getName());
		System.out.println(p1.getRollNumber());
				
	}

}
