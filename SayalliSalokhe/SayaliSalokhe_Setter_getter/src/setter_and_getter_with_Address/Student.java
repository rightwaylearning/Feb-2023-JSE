package setter_and_getter_with_Address;

public class Student {
	private int roll_No;
	private String name;
	private Address adr;

	public int getRoll_No() {
		return roll_No;
	}

	public void setRoll_No(int roll_No) {
		this.roll_No = roll_No;
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
