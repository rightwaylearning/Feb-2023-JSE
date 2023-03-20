package employee.info;

public class EmployeeAddress {
	private String line1;
	private String line2;
	private int pinCode;
	 public  EmployeeAddress() {
		 
	 }
	public EmployeeAddress(String line1, String line2, int pinCode) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.pinCode = pinCode;
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
	public int getPinCode() {
		return pinCode;
	}
	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
	

}
