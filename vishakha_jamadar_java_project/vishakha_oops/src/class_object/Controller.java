package class_object;

public class Controller {
	public static void main(String[] args) {
		WayToCallMethods v= new WayToCallMethods();
		v.m1();
		//==================
		
	
        new WayToCallMethods().m1();
}
}