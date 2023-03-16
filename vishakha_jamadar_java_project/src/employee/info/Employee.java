package employee.info;

public class Employee {
	private String name;
	private Address adr;
	private company com;
	private String doj;
	private int [] last4_month_salary;
	
	
	public Employee() {
		
	}


	public Employee(String name, Address adr, company com, String doj, int[] last4_month_salary) {
		super();
		this.name = name;
		this.adr = adr;
		this.com = com;
		this.doj = doj;
		this.last4_month_salary = last4_month_salary;
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


	public company getCom() {
		return com;
	}


	public void setCom(company com) {
		this.com = com;
	}


	public String getDoj() {
		return doj;
	}


	public void setDoj(String doj) {
		this.doj = doj;
	}


	public int[] getLast4_month_salary() {
		return last4_month_salary;
	}


	public void setLast4_month_salary(int[] last4_month_salary) {
		this.last4_month_salary = last4_month_salary;
	}
	

}
