package rp_practice.programs;

public class Case1 {
	
	public String message;
	public static String Name;


//	this is constructor in that aapn object properties initialize karu shaktoh
	public Case1(){
		this.message = "hello2 message";
		Case1.Name = "feff";
		
	}
	
	
	public Case1(String message) {
		super();
		this.message = message;
	}

	
	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public static String getName() {
		return Name;
	}


	public static void setName(String name) {
		Name = name;
	}



	
	
	
}
