package aadhaar.info;

public class PersonalInfo {
	
	public String name;
    public int birthYear;
	public Address adr;
	
public void info() {
	
	System.out.println("Name = " +name);
	System.out.println("birthYear = "+birthYear);
	System.out.println("Address----" +adr);
}

public void address() {
	System.out.println("buldingNo = " +adr.buldingNo);
	System.out.println("landmark = " +adr.landmark);
	System.out.println("Area = " +adr.area);
	System.out.println("pinCode = " +adr.pinCode);
	
  }

}
