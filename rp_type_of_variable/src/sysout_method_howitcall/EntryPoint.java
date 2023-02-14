package sysout_method_howitcall;

public class EntryPoint {

	public static void main(String[] args) {
		
		MySystem m = new MySystem();
		
		m.a =32 ;
		
	System.out.println("this is static method i am calling " + MySystem.a1);

	//		m.out = new MyPrintStream();
//		m.out.b = 32;
//		m.out.print("hello");
//		
//		yachi garj padu nayye mhnun aapn tyala static jr kela
//		tr sopa hota
		
		MySystem.out= new MyPrintStream();
		MySystem.out.b = 4344;

		
		MySystem.out.print("hello this is argument i am passing to declare parameters");
		
		
	}
}
