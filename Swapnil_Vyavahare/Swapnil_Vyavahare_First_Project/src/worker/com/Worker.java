package worker.com;

public class Worker {
	
	private String worker_Name;
	private String worker_Designation;
	private Address[] adr;
	private int[] salary;
	private Company company;
	
	public Worker() {}

	public Worker(String worker_Name, String worker_Designation, Address[] adr, int[] salary, Company company) {
		super();
		this.worker_Name = worker_Name;
		this.worker_Designation = worker_Designation;
		this.adr = adr;
		this.salary = salary;
		this.company= company;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public String getWorker_Name() {
		return worker_Name;
	}

	public void setWorker_Name(String worker_Name) {
		this.worker_Name = worker_Name;
	}

	public String getWorker_Designation() {
		return worker_Designation;
	}

	public void setWorker_Designation(String worker_Designation) {
		this.worker_Designation = worker_Designation;
	}

	public Address[] getAdr() {
		return adr;
	}

	public void setAdr(Address[] adr) {
		this.adr = adr;
	}

	public int[] getSalary() {
		return salary;
	}

	public void setSalary(int[] salary) {
		this.salary = salary;
	};
	
	
	
	
	
	

}
