package else_if_example;

public class ClassRoom {

	private String classRoom;
	private int upperAge;
	private int lowerAge;
	private double fees;

	public ClassRoom() {
	}

	public ClassRoom(String classRoom, int upperAge, int lowerAge, double fees) {
		super();
		this.classRoom = classRoom;
		this.upperAge = upperAge;
		this.lowerAge = lowerAge;
		this.fees = fees;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public int getUpperAge() {
		return upperAge;
	}

	public void setUpperAge(int upperAge) {
		this.upperAge = upperAge;
	}

	public int getLowerAge() {
		return lowerAge;
	}

	public void setLowerAge(int lowerAge) {
		this.lowerAge = lowerAge;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

}
