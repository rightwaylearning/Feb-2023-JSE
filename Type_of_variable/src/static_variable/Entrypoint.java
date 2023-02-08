package static_variable;


public class Entrypoint {
	public static void main(String[] args) {
		
		A a=new A();
		a.x=10;
		a.y=20;
		
		A a1=new A();
		a1.x=34;
		a1.y=12;
		
		A s= new A();
		s.x =10;
		s.y =20;
		A.z =100000; 
		
		A s1= new A();
		s1.x =1;
		s1.y =2;
		A.z =999;
		
		A a2= new A();
		a2.x = 100;
		a2.y = 200;
		
		System.out.println(A.z);
		System.out.println(A.z);
		
	}

}
