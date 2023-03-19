package class_object;

public class Controller {
	public static void main(String[] args) {
		
		CallMethod r1;
		r1 = new CallMethod();
        r1.m1();
        
        //-----------------------------------------
        
        CallMethod r2 = new CallMethod();
        r2.m1();
        
        //-----------------------------------------
        // here we can use object only one time 
        new CallMethod().m1();

	}
}
