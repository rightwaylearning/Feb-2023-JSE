package abstract_example;

public class Parent {
     void HomeConstruction() {
    	 System.out.println("Old Style");   	 
     }
     void bankBalance() {
    	 System.out.println("Fd=5000000");
    	 
     }
}

      class Child extends Parent{
	  void HomeConstruction() {
		  System.out.println("New Style");		  
	  }
	  void ownBussines() {
	  System.out.println("Digital Marketing");
  }
  }

