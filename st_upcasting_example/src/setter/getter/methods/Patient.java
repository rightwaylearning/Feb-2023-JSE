package setter.getter.methods;

public class Patient {
	
	public static void main(String[] args) {
		
		Docter d = new Docter(); 
		
		d.setRegNo(2345);
		d.setName("swapnali");
		
		
		String name = d.getName();
		int regNo = d.getRegNo();
		
		System.out.println(name);
		System.out.println(regNo);
	}

}
