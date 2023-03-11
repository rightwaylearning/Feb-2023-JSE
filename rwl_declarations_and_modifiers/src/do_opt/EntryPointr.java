package do_opt;

import java.util.Date;

import package_one.One;


public class EntryPointr {

	public static void main(String[] args) {
		
		One obj = new One();
		obj.showMe();
		
		package_two.One obj1 = new package_two.One();
		obj1.showToOther();
		
	    Date d1= new Date();
	    
	    java.sql.Date obj2 = new java.sql.Date(234L);
		
	}
}
