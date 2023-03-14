package do_opt;

import java.util.Date;

import package_one.One;

//import package_one.IamOne;

public class EntryPoint {

	public static void main(String[] args) {
		
		//IamOne obj = new IamOne();
	    //package_one.IamOne obj = new package_one.IamOne();	
		//obj.showMe();
		  
		One obj = new One();
		   obj.showMe();
		   
		   package_two.One obj1 = new package_two.One();
		   obj1.showToOther();
		   
		   Date d1 = new Date();
		   
		   java.sql.Date obj2 = new java.sql.Date(1234L);
		
	}
}
