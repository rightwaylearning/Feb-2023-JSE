package toString.method;

public class Client {
	
	public static void main(String[] args) {
		Test t = new Test();
		t.name="Akshay";
		t.num=2022;
		// System.out.println(t);//toString();
		
		
		
		Test t1= new Test();
		
		Test t2= new Test();
		
		Test t3= t1;
		
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		
		
	   // hashcode is a unique id which is represent object. with help of actual object memory address intenally java created that unique id that is hashcode();
	} 
	
	

}
