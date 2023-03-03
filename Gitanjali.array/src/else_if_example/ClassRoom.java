package else_if_example;

public class ClassRoom {
	private String Classroom;
	private int lowerAge;
	private int upperAge;
	private double Fees;

	public ClassRoom() {
	}

	public ClassRoom(String classroom, int lowerAge, int upperAge, double fees) {
		super();
		Classroom = classroom;
		this.lowerAge = lowerAge;
		this.upperAge = upperAge;
		Fees = fees;
	}

	public String getClassroom() {
		return Classroom;
	}

	public void setClassroom(String classroom) {
		Classroom = classroom;
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

	public double getFees() {
		return Fees;
	}

	public void setFees(double fees) {
		Fees = fees;
	}

}
