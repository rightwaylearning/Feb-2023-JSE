package student.info;

public class Address {
      String landmark;
      String area;
      int pinCode;
      
     public  Address(){}

	public Address(String landmark, String area, int pinCode) {
		
		this.landmark = landmark;
		this.area = area;
		this.pinCode = pinCode;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}
     
     
      
}
