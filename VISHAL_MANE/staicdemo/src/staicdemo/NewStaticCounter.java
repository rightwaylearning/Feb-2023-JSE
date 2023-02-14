package staicdemo;

public class NewStaticCounter {
	
	public static void main(String[] args){
		
	counter obj1=new counter();
	
	System.out.println(obj1.count);
	
	obj1.count();
	obj1.count();
	
	System.out.println(obj1.count);
	
	counter obj2=new counter();
	System.out.println(obj2.count);
	obj2.count();
	
	System.out.println(obj1.count);
	System.out.println(obj2.count);
	}
	
	
}
