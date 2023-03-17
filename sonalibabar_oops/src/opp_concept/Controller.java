package opp_concept;

public class Controller 
{
	public static void main(String[] args) {
		
		// first way
//		C c= new C();
//		B b =new B(c); 
//		A a= new A(b);  
//		System.out.println(a.message);
		
		//---------------------------
		// second way
		
		A res=Afactory.getInstance();
		System.out.println(res.meassage);
	}
	
	
	

}
