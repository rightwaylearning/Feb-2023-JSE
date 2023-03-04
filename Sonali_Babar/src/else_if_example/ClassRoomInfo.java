package else_if_example;

public class ClassRoomInfo
{
	private String classRoom;
	private int lowerAge;
	private int upperAge;
	private double fees;
	
	ClassRoomInfo()
	{
		
	}

	public ClassRoomInfo(String classRoom, int lowerAge, int upperAge, double fees) {
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

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}
	
	
	
	

}
