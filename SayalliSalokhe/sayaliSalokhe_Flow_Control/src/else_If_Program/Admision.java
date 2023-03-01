package else_If_Program;

public class Admision {
	private String classRoom;
	private int lowerAge;
	private int upperAge;
	private int fees;

	public Admision() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admision(String classRoom, int lowerAge, int upperAge, int fees) {
		super();
		this.classRoom = classRoom;
		this.lowerAge = lowerAge;
		this.upperAge = upperAge;
		this.fees = fees;
	}

	public String getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(String classRoom) {
		this.classRoom = classRoom;
	}

	public int getLowerAge() {
		return lowerAge;
	}

	public void setLowerAge(int lowerAge) {
		this.lowerAge = lowerAge;
	}

	public int getUpperAge() {
		return upperAge;
	}

	public void setUpperAge(int upperAge) {
		this.upperAge = upperAge;
	}

	public int getFees() {
		return fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}

}
