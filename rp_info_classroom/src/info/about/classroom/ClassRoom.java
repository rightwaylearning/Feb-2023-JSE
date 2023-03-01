package info.about.classroom;

public class ClassRoom {
	
	private String classAllocate;
	private int lowerAge;
	private int upperAge;
	private double fees;
	
	public ClassRoom(String classAllocate, int lowerAge, int upperAge, double fees) {
		super();
		this.classAllocate = classAllocate;
		this.lowerAge = lowerAge;
		this.upperAge = upperAge;
		this.fees = fees;
	}
	
	ClassRoom(){}

	public String getClassAllocate() {
		return classAllocate;
	}

	public void setClassAllocate(String classAllocate) {
		this.classAllocate = classAllocate;
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
