package sample_programs;

class B{
	@Override
	public String toString() {
		return "Hello";
	}
}

public class ToStringDemo {
	
	public static void main(String[] args) {
		 B b = new B();
		 System.out.println(b);// b.toString();
	}

}
