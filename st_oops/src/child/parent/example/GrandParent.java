package child.parent.example;

public class GrandParent {

	void m1() {
		System.out.println(" I am m1 of GrandParent");
	}
	
	void m2() {
		System.out.println(" I am m2 of GrandParent");
	}
	
	
}

class Parent extends GrandParent{
	
		void m2() {
		System.out.println(" I am m2 of Parent");
	}
		
		void m3() {
			System.out.println(" I am m3 of Parent");
		}
}

class Child extends Parent{
	
	void m3() {
		System.out.println(" I am m3 of Child");
	}
	

	void m4() {
		System.out.println(" I am m4 of Child");
	}
}
