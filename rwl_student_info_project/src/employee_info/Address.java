package employee_info;

public class Address {
	private String line1;
	private String line2;
	private int pin;

	public Address() {
	}

	public Address(String line1, String line2, int pin) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pin = pin;
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

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	};

}
