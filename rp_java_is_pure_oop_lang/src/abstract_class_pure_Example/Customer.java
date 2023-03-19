package abstract_class_pure_Example;

public class Customer {
	
	
 public static void main(String[] args) {
	
	 
//	 create factory method and return object
	 
	 System.out.println("Object return by factory method");
	 
	 Waiter w = GetInstance.getObject();
	 
	 w.naan();
	 
	 w.paneer();
	 
	 
	 System.out.println("object call by direct");
	 
	 
	 Waiter w1 = new Cook();
	 
	 w1.paneer();
	 
	 w1.naan();
	 
	 
	 
}
	

}
