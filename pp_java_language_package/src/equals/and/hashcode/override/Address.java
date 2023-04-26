package equals.and.hashcode.override;

public class Address {
	
	public String line1;
	public String line2;
	public Integer pincode;
	
	Address(){}

	public Address(String line1, String line2, Integer pincode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pincode = pincode;
	}
	
	@Override
	public int hashCode() {
		
		return this.line1.hashCode() + this.line2.hashCode() + this.pincode.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
			if(obj instanceof Address) {
				Address adr=(Address)obj;
				if(this.line1.equals(adr.line1) && this.line2.equals(adr.line2) && this.pincode.equals(pincode) ) {
					return true;
				}
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
