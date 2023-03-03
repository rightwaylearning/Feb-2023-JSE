package employee.setter.getter;

public class Controller {

	public static void main(String[] args) {

		Employee e = new Employee();

		e.setEmpName("Ramesh");
		e.setEmpId(45);

		String EmpName = e.getEmpName();

		System.out.println(EmpName);

		int EmpId = e.getEmpId();

		System.out.println(EmpId);

	}

}
