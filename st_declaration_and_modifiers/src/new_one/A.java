package new_one;

public class A {

	public String message;
	static public String commonMessage;
	
	public A() {
		  this.message = "Hi I am Instance property";
		  A.commonMessage = "I am static property";
	}
	
	public void m1() {
		System.out.println("I am  instance method of A class");
			}
	static public void m2() {
		System.out.println("I am  static method of A class");
			}
		
}
