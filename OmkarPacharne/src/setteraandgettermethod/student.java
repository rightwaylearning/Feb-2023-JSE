package setteraandgettermethod;

public class student {
	private String Name;
	
	private int RollNumber;
	
	private Address adr;
	
	
	
	//right click > source >generate setter amd getter 
	
	public String getName() {
		
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public int getRollNumber() {
		return RollNumber;
	}
	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

}
