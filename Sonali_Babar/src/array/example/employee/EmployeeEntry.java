package array.example.employee;

public class EmployeeEntry {
	public static void main(String[] args) {
		Employee[] arr = new Employee[5];

		arr[0] = new Employee(1001, "Sonali Babar", "7058194522", "Ahmednagar");

		arr[1] = new Employee();
		arr[1].setEmpId(1002);
		arr[1].setEmpName("Mayur Babar");
		arr[1].setEmpMobNumber("9307482918");
		arr[1].setEmpAddress("Bhingar");

		Employee e3 = new Employee(1003, "Snehal Takale", "9960567890", "Pune");
		arr[2] = e3;

		Employee e4 = new Employee();
		e4.setEmpId(1004);
		e4.setEmpName("Sakshi Basakare");
		e4.setEmpMobNumber("7448177084");
		e4.setEmpAddress("Pune");
		arr[3] = e4;

		EmployeeEntry.printEmployeeData(arr);

	}

	public static void printEmployeeData(Employee[] arr) {
		System.out.println("----------Employee Data------------");
		System.out.println("EmpId " + arr[0].getEmpId());
		System.out.println("EmpName " + arr[0].getEmpName());
		System.out.println("EmpMobNumber " + arr[0].getEmpMobNumber());
		System.out.println("EmpAddress " + arr[0].getEmpAddress());
		System.out.println("***************************");

		System.out.println("EmpId " + arr[1].getEmpId());
		System.out.println("EmpName " + arr[1].getEmpName());
		System.out.println("EmpMobNumber " + arr[1].getEmpMobNumber());
		System.out.println("EmpAddress " + arr[1].getEmpAddress());
		System.out.println("***************************");

		System.out.println("EmpId " + arr[2].getEmpId());
		System.out.println("EmpName " + arr[2].getEmpName());
		System.out.println("EmpMobNumber " + arr[2].getEmpMobNumber());
		System.out.println("EmpAddress " + arr[2].getEmpAddress());
		System.out.println("***************************");

		System.out.println("EmpId " + arr[3].getEmpId());
		System.out.println("EmpName " + arr[3].getEmpName());
		System.out.println("EmpMobNumber " + arr[3].getEmpMobNumber());
		System.out.println("EmpAddress " + arr[3].getEmpAddress());
	}

}
