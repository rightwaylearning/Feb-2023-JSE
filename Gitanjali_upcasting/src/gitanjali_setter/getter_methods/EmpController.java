package gitanjali_setter.getter_methods;

public class EmpController {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(56);
		e.setEmployeeName("Reshma");
		Address adr = new Address();
		adr.setLine1("a/p Shivanjali");
		adr.setLine2("Shirur");
		adr.setPin(413702);
		e.setAdr(Adr);
		int empId = e.getEmployeeId();
		System.out.println(e.getEmployeeId());
		String name = e.getEmployeeName();
		System.out.println(e.getEmployeeName());
		Address adr1 = e.getAdr();{
		System.out.println(adr1.getLine1());
		System.out.println(adr1.getLine2());
		System.out.println(adr1.getPin());
	}
}
}