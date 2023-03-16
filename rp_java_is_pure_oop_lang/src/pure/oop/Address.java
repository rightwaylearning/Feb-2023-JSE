package pure.oop;

public class Address {
	
	
 private String line1;
 private String line2;
 private Integer pinCode;
 
 
public Address(String line1, String line2, Integer pinCode) {
	super();
	this.line1 = line1;
	this.line2 = line2;
	this.pinCode = pinCode;
}

public Address() {}



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


public Integer getPinCode() {
	return pinCode;
}


public void setPinCode(Integer pinCode) {
	this.pinCode = pinCode;
}
 
 

}
