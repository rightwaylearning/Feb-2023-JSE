package setter.getter.main.employeeinfo;

public class Address {

	private String line1;
	private String line2;
	private int pin;

	public void setLine1(String line1) {

		this.line1 = line1;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine2(String line2) {

		this.line2 = line2;
	}

	public String getLine2() {
		return this.line2;
	}

}
