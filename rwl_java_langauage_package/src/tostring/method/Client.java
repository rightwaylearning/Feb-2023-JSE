package tostring.method;

public class Client {

	public static void main(String[] args) {
		
		Test t= new Test();
		t.num =100;
		t.name = "Madhura";
		//System.out.println(t); //t.toString();
		
		
		Test t1= new Test();
		
		Test t2 = new Test();
		
		Test t3 = t1;
		
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		// hash code is unique id which is represent object. with help of actual object memory address intenally java created that unique id that is hashCode();
	}
}
