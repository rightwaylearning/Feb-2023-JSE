package abstract_example;

public class Parent {
     void HomeConstruction() {
    	 System.out.println("Old Style");   	 
     }
     void bankBalance() {
    	 System.out.println("Fd=3000000");
    	 
     }
}

  abstract class Child extends Parent{
	  void Homeconstruction() {
		  System.out.println("New Style");		  
	  }
	  abstract void bankBalance();
  }

