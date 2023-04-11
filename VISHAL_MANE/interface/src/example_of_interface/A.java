package example_of_interface;

public interface A {
	
	//Creating interface that has 4 methods S
	
	void m();
	void n(); //by default, public and abstract 
	void o();
	void p();
	
}
//Creating abstract class that provides the implementation of one method of A interface  

abstract class B implements A{
	
	public void n() {System.out.println("I am n");} 
	 
	 
	 
 }
 
  class C extends B{
	 
	 public void m(){System.out.println("I am m");}  
	 public void o(){System.out.println("I am o");}  
	 public void p(){System.out.println("I am p");}  
	 
 } 
  