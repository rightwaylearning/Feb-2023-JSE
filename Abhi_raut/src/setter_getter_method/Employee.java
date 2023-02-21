package setter_getter_method;

public class Employee {
	private String name;
	private int id;
	private Address adr;
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return this.name;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return this.id;
	}
	
	public void setAdr(Address adr) {
		this.adr=adr;
	}
	public Address getAdr() {
		return this.adr;
	}
	
	

}
