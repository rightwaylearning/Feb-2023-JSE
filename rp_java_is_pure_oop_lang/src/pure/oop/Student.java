package pure.oop;

public class Student {
	
	
	private String name;
	private Integer no;
	private Address adr;
	
	
	public Student() {
			this.no = 54;
			
			
	}
	
	public Student(String name, Integer no, Address adr) {
		super();
		this.name = name;
		
		if(no>=1 && no<=60) {
		this.no = no;
		}
		
		this.adr = adr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public Address getAdr() {
		return adr;
	}

	public void setAdr(Address adr) {
		this.adr = adr;
	}

}
