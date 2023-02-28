package student.info;

public class InputOutput {
  
	public static Address createAddressObject(String line1, String line2, String city, int pin) {
		Address adr = new Address(line1, line2, city, pin);
		    return adr;
	}
}
