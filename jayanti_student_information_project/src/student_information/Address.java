package student_information;

public class Address {
	

	private String line1;
	private String line2;
	private String city;
	private int pincode;
	
	//defalut constructor
	public Address() {
		
	}

	//Parameterized constructor
	public Address(String line1 ,String line2, String city, int pincode) {
		
		this.line1 = line1 ;
		this.line2 = line2;
		this.city = city;
		this.pincode= pincode;
		
	}
	
	//Getters
	
	public String getLine1() {
		return line1;
	}

	public String getLine2() {
		return line2;
	}
	
	public String getCity() {
		return city;
	}
			 
	public int getPincode() {
		return pincode;
	}
	
	//Setters
	
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setPincode(int Pincode) {
		this.pincode = Pincode;
	}

}
