package class_object;

public class Controller {
	
	public static void main(String[] args) {
		
		WayToCallMethods r1;
		   r1 = new WayToCallMethods();
		   r1.m1();
	//----------------------------------------------------
		   WayToCallMethods r2 = new WayToCallMethods();
		      r2.m1();
    //------------------------------------------------------
		      
		   // here we can use object only one time
		 		      new WayToCallMethods().m1();
	}

}
