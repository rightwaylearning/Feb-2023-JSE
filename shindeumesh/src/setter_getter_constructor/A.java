package setter_getter_constructor;

public class A {

	private String name;
	private int RollNumber;

	A() {
	}

	public A(String name, int rollNumber) {
		super();
		this.name = name;
		RollNumber = rollNumber;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollNumber() {
		return RollNumber;
	}

	public void setRollNumber(int rollNumber) {
		RollNumber = rollNumber;
	}

}
