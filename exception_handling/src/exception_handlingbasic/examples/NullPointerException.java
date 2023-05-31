package exception_handlingbasic.examples;

public class NullPointerException {

	public static void main(String[] args) {
		
      PrintData p = new PrintData();
      p.printData(null);
	}
	
}

class Student{
	
	void show() {
		System.out.println("hello");
	}
}
