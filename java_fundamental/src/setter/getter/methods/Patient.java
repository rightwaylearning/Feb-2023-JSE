package setter.getter.methods;

public class Patient {

	public static void main(String[] args) {
		
		Docter d= new Docter();
		
		d.setRegNo(37456374);
		d.setName("Sadagopan");
		
	    int regNo = d.getRegNo();
		String name = d.getName();
		
		System.out.println(regNo);
		System.out.println(name);
	}
}
