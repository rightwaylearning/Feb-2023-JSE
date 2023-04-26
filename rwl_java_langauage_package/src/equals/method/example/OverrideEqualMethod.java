package equals.method.example;

class Employee {
	Integer employeeId;
	String employeeName;
	Double salary;

	Employee() {
	}

	public Employee(Integer employeeId, String employeeName, Double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Employee) {

			Employee e2 = (Employee) obj;
			
			if(this == e2) {
				return true;
			}

			if (this.employeeId.equals(e2.employeeId) && this.employeeName.equals(e2.employeeName)
					&& this.salary.equals(e2.salary)) {
				return true;
			}
		}

		return false;
	}

}

public class OverrideEqualMethod {

	public static void main(String[] args) {

		Employee e1 = new Employee(1215, "Arjun", 198320.00);
		Employee e2 = new Employee(1215, "Arjun", 198320.00);
		Employee e3=e1;
		MySelf m = new MySelf();

		System.out.println(e1.equals(e2));  

	}
}

class MySelf {
}