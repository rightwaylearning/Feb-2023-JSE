package static_var_example;

public class Testing {

	public static void main(String[] args) {
		
		
		A a= new A();
		a.x =10;
		a.y =20;
		A.z =100000; 
		
		A a1= new A();
		a1.x =1;
		a1.y =2;
		A.z =999;
		
		A a2= new A();
		a2.x = 100;
		a2.y = 200;
		
		System.out.println(A.z); // 999
		System.out.println(A.z);
		System.out.println(A.z);
		System.out.println(A.z);
			
		
	}
}
