package rp_practice.programs;

public class Case1 {
	
	public String message;
	static public String name;


//	this is constructor in that aapn object properties initialize karu shaktoh
	public Case1(){
		this.message = "hello2 message";
		Case1.name = "feff";
		
	}
	
	public static void m1() {
		
		System.out.println("this is static method");
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


	public static String getname() {
		return name;
	}


	public static void setname(String name) {
		Case1.name = name;
	}



	
	
	
}
