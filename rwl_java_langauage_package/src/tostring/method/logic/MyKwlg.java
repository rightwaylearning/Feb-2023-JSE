package tostring.method.logic;

class Test{
	
}

public class MyKwlg {

	public static void main(String[] args) {
	
		Test t = new Test();
		
		System.out.println(t.getClass().getName() +"@"+Integer.toHexString(t.hashCode()));
		             // this.getClass().getName() + "@" + Integer.toHexString(this.hashCode())
		//---------------------------------------
		System.out.println("----------------------");
		System.out.println(t.toString()); // t.toString()
		
		// toString of Object class
		// print fully qualifield name of class "@" hashCode in hex number formatt
	}
}
