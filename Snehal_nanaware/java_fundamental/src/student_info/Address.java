package student_info;

public class Address {
	private String line1;
    private String line2;
     private int pincode;
     
     Address() {
 	}

 	public Address(String line1, String line2, int pin) {
 		super();
 		this.line1 = line1;
 		this.line2 = line2;
 		this.pincode=pincode;
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
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
}