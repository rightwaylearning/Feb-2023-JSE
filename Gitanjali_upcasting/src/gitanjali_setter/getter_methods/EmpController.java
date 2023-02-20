package gitanjali_setter.getter_methods;

public class EmpController {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.setEmployeeId(56);
		e.setEmployeeName("Reshma");
		//e.setEmployeeAddress("a.nagar");
		System.out.println(e.getEmployeeId());
		System.out.println(e.getEmployeeName());
		System.out.println(e.getEmpAddress());

	}
}
