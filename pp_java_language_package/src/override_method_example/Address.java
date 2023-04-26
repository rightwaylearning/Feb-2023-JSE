package override_method_example;

public class Address {

	public String line1;
	public String line2;
	public Integer pincode;

	Address() {
	}

	public Address(String line1, String line2, Integer pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pincode = pincode;
	}
	
	@Override
	public boolean equals(Object obj) {
		Address adr=(Address)obj;
		if(obj instanceof Address) {
			return true;
		}
		if(this.line1==adr.line1 && this.line2==adr.line2 && this.pincode==adr.pincode) {
			return true;
		}
		return false;
	}

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

	public Integer getPincode() {
		return pincode;
	}

	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [line1=" + line1 + ", line2=" + line2 + ", pincode=" + pincode + "]";
	}

}
