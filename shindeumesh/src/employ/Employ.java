package employ;

public class Employ {

	private String employName;
	private String CompneyNmae;
	private Address[] address;
	private int[] salary;

	public Employ() {

	}

	public Employ(String employName, String compneyNmae, Address[] address, int[] salary) {
		super();
		this.employName = employName;
		CompneyNmae = compneyNmae;
		this.address = address;
		this.salary = salary;
	}

	public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public String getCompneyNmae() {
		return CompneyNmae;
	}

	public void setCompneyNmae(String compneyNmae) {
		CompneyNmae = compneyNmae;
	}

	public Address[] getAddress() {
		return address;
	}

	public void address(Address[] address) {
		this.address = address;
	}

	public int[] getSalary() {
		return salary;
	}

	public void setSalary(int[] salary) {
		this.salary = salary;
	}

	public void setAddress(Address[] addressinfo) {
		// TODO Auto-generated method stub
		
	}
}