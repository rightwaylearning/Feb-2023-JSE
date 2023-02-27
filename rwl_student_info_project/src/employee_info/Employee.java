package employee_info;

public class Employee {

	private String name;
	private Address adr;
	private Company com;
	private String doj;
	private int[] last3_Month_Salary;

	public Employee() {
	}

	public Employee(String name, Address adr, Company com, int[] last3_Month_Salary, String doj) {
		super();
		this.name = name;
		this.adr = adr;
		this.com = com;
		this.last3_Month_Salary = last3_Month_Salary;
		this.doj=doj;
	}

	public String getDoj() {
		return doj;
	}

	public void setDoj(String doj) {
		this.doj = doj;
	}

	public int[] getLast3_Month_Salary() {
		return last3_Month_Salary;
	}

	public void setLast3_Month_Salary(int[] last3_Month_Salary) {
		this.last3_Month_Salary = last3_Month_Salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

	public Company getCom() {
		return com;
	}

	public void setCom(Company com) {
		this.com = com;
	}

	public int[] getSalary() {
		return last3_Month_Salary;
	}

	public void setSalary(int[] last3_Month_Salary) {
		this.last3_Month_Salary = last3_Month_Salary;
	};

}
