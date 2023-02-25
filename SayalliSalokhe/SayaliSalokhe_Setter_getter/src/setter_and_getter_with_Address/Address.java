package setter_and_getter_with_Address;

public class Address {
	private String line1;
	private String line2;
	private int pin_Code;

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

	public int getPin_Code() {
		return pin_Code;
	}

	public void setPin_Code(int pin_Code) {
		this.pin_Code = pin_Code;
	}

}
