package setteraandgettermethod;

public class Address {
	
	private String Line1;
	
	private String Line2;
	
	private int Pincode;
	
	//right click > source >generate setter amd getter 
	
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
	public int getPincode() {
		return Pincode;
	}
	public void setPincode(int pincode) {
		Pincode = pincode;
	}
	

}
