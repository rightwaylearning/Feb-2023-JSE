package setter_getter_constructor;

public class Employ {

	private String EmployName;
	private int EmployId;

	Employ() {
	}

	public Employ(String employName, int employId) {
		super();
		EmployName = employName;
		EmployId = employId;
	}

	public String getEmployName() {
		return EmployName;
	}

	public void setEmployName(String employName) {
		EmployName = employName;
	}

	public int getEmployId() {
		return EmployId;
	}

	public void setEmployId(int employId) {
		EmployId = employId;
	}

}
