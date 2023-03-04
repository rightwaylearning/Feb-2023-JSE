package else_if_example;

public class ClassRoom {
	
	private String classRoom;
	private int lowerAge;
	private int uperAge;
	private double fees ;
	
	
	public ClassRoom() {}

	public ClassRoom(String classRoom, int lowerAge, int uperAge, double fees) {
		super();
		this.classRoom = classRoom;
		this.lowerAge = lowerAge;
		this.uperAge = uperAge;
		this.fees = fees;
	}

	public String getClassRomm() {
		return classRoom;
	}

	public void setClassRomm(String classRoom) {
		this.classRoom = classRoom;
	}

	public int getLowerAge() {
		return lowerAge;
	}

	public void setLowerAge(int lowerAge) {
		this.lowerAge = lowerAge;
	}

	public int getUpperAge() {
		return uperAge;
	}

	public void setUpperAge(int upperAge) {
		this.uperAge = upperAge;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	}
	
	


