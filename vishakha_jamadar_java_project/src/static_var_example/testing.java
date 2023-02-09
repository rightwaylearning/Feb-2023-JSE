package static_var_example;

public class testing {
	public static void main(String[] args) {
		A a= new A();
		a.x=100;
		a.y=200;
		A.z=3000;
		
		A a1 = new A();
		a1.x =200;
		a1.y =300;
		
		A a2 =new A();
		a2.x = 3500;
		a2.y = 5000;
		
		
		System.out.println(A.z);
		System.out.println(a1.z);
		System.out.println(a2.x);	
	}

}
