package gitanjali_setter.getter_methods;

public class Patient {
public static void main(String[] args) {
	 Doctor d =new Doctor();
	d.setRegNo(455667);
	d.setName("Akash");
	
	int regNo=d.getregNo();
	String name=d.getName();
	System.out.println(regNo);
	System.out.println(name);
	
}
}
