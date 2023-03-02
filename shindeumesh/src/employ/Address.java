package employ;

public class Address {

	private String line1;
	private String line2;
	private String cityName;
	private int renNo;

	public Address() {
	}

	public Address(String line1, String line2, String cityName, int renNo) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.cityName = cityName;
		this.renNo = renNo;
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

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public int getRenNo() {
		return renNo;
	}

	public void setRenNo(int renNo) {
		this.renNo = renNo;
	}

}
