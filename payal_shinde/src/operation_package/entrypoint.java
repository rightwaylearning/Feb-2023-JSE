package operation_package;

public class entrypoint {

	
	public static void main(String[]args) {
		
		test t= new test();
		
		t.a= 18;
		t.b= 20;
		int c=t.sum();
		System.out.println(c);
		
		
	}
}
