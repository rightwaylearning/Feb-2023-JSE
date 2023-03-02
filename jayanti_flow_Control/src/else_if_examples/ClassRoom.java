package else_if_examples;

public class ClassRoom {
	
	private String classRoom;
	private int lowerAge;
	private int upperAge;
	private double fees;
	
	//default constructor
	public ClassRoom() {
	}
 
	//parameterized constructor
	public ClassRoom(String classRoom, int lowerAge, int upperAge, double fees) {
		this.classRoom = classRoom;
		this.lowerAge = lowerAge;
		this.upperAge = upperAge;
		this.fees=fees;
	}
	
	//getters
	public String getClassRoom() {
		return classRoom;
    }
	
	public int getLowerAge() {
		return lowerAge;
	}
	
	public int getUpperAge() {
		return upperAge;
	}
	
	public double getFees() {
		return fees;
	}
	
	//setters
	public void setClassroom(String classRoom) {
		this.classRoom = classRoom;
	}
	
	public void setLowerAge(int lowerAge) {
		this.lowerAge= lowerAge;
	}
	
	public void setUpperAge(int upperAge) {
		this.upperAge= upperAge;
	}
	
	public void setFees(double fees) {
		this.fees = fees;
		
	}
	
	
}
