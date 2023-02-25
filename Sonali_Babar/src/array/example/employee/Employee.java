package array.example.employee;

public class Employee {
	private int empId;
	private String empName;
	private String empMobNumber;
	private String empAddress;

	Employee() {

	}

	public Employee(int empId, String empName, String empMobNumber, String empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empMobNumber = empMobNumber;
		this.empAddress = empAddress;
	}

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpMobNumber() {
		return empMobNumber;
	}

	public void setEmpMobNumber(String empMobNumber) {
		this.empMobNumber = empMobNumber;
	}

}
