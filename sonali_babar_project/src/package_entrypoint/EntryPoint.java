package package_entrypoint;

import java.util.Date;

import package_one.One;

public class EntryPoint {
	public static void main(String[] args) {
		One obj=new One();
		obj.add();
		
		package_two.One obj1=new package_two.One();
	    obj1.sub();
	    
	    Date d=new Date();
	    
	 
	}
       
}
