package student_info;

public class Address {
	public Address(String line1, String line2, String city, int pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.pincode = pincode;
	}

	private String line1;
	private String line2;
	private String city;
	private int pincode;

	public String getLine1() {
		return line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address() {
	}
}
