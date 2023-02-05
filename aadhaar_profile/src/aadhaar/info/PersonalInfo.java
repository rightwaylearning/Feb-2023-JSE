package aadhaar.info;

public class PersonalInfo {
	
	public String name;
    public int birthYear;
	public Address adr;
	
public void info() {
	
	System.out.println(name);
	System.out.println(birthYear);
	System.out.println(adr);
}

public void address() {
	System.out.println(adr.buldingNo);
	System.out.println(adr.landmark);
	System.out.println(adr.area);
	System.out.println(adr.pinCode);
	
  }

}
