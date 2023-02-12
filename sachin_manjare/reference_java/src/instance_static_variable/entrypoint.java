package instance_static_variable;

public class entrypoint {
	
	public static void main(String[]args) {
		
		 A a= new A(); 
		 a.a=10;
		 a.b=20;
		 a.x=30;

		 
		 

			System.out.println(a.a);
			System.out.println(a.b);
			System.out.println(A.x);
			System.out.println(A.y);
		
	}
}
