package arrayWithMultileClass;

public class School {
	private int regNo;
	private String name;
	private Address adr;

	public School() {
		super();
		// TODO Auto-generated constructor stub
	}

	public School(int regNo, String name, Address adr) {
		super();
		this.regNo = regNo;
		this.name = name;
		this.adr = adr;
	}

	public int getRegNo() {
		return regNo;
	}

	public void setRegNo(int regNo) {
		this.regNo = regNo;
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

}
