package arrey.example;

public class Doctor {
private int regNo;
private String Name;



public Doctor() {
	
}



public Doctor(int regNo, String name) {
	super();
	this.regNo = regNo;
	Name = name;
}



public int getRegNo() {
	return regNo;
}



public void setRegNo(int regNo) {
	this.regNo = regNo;
}



public String getName() {
	return Name;
}



public void setName(String name) {
	Name = name;
}

}