package hashcode.example;

class A{}
class B {}

//   == 

public class CompareHashCode1 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		int c =10;
		
//		System.out.println(a==b);
//		System.out.println(a==c);
		
		A a1=new A();
		A a2=new A();
	//	System.out.println(a1==a2);
		A a3=a1;
	//   System.out.println(a1 == a3);
		B b1= new B();
	//	System.out.println(a1==b1);
		
	}
}
