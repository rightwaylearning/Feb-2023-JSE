package student.info;

public class Address {

	private String Line1;
	private String Line2;
	private String City;
	private int pinCode;

	// object creation

	public Address() {}

	// parameterised constructor

	public Address(String line1, String line2, String city, int pinCode) {
		super();
		Line1 = line1;
		Line2 = line2;
		City = city;
		this.pinCode = pinCode;
	}

	// generate getter and setter 
	
	public String getLine1() {
		return Line1;
	}

	public void setLine1(String line1) {
		Line1 = line1;
	}

	public String getLine2() {
		return Line2;
	}

	public void setLine2(String line2) {
		Line2 = line2;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
}
