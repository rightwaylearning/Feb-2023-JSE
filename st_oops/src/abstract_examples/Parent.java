package abstract_examples;

public class Parent {
	
	void homeConstruction() {
		System.out.println("old style");
	}
	
	void bankBalance() {
		System.out.println("FD= 300000.00");
	}
	
	}
  class Child extends Parent{
	  
		void homeConstruction() {
			System.out.println("new style");
		}
		void ownBussiness() {
			System.out.println("digital marketing");
		}
  }