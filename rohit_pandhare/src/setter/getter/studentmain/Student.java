package setter.getter.studentmain;

public class Student {
	
	private int rollNo;
	private String name;
	private Address adr;
	
	public void setAdr(Address adr) {
		this.adr = adr;
		
	}
	
	public Address getAdr() {
		return adr;
		
	}

	public int getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
