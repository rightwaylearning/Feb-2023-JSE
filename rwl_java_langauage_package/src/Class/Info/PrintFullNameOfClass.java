package Class.Info;

import java.lang.reflect.Method;

class MySelf{
	
	public void m1(int a, int b) {}
	
	public void m2(String str) {}
}


public class PrintFullNameOfClass {

	public static void main(String[] args) {
		
		// 1
		//Class c = MySelf.class;
		
	   // 2
		MySelf m = new MySelf();
		Class c1=  m.getClass();
		System.out.println(c1);
		
		System.out.println(c1.getName());
		
		Method[] methods = c1.getMethods();
		for(int i =0 ; i<methods.length;i++) {
			System.out.println(methods[i].getName());
		}
		
	}
}
