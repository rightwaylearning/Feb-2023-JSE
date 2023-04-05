package Methode_overloding;

public class Grandfather {
	
	void m1() {
		System.out.println("this is m1 mehotde of Grandfather");
	}
	
	void m2() {
		System.out.println("This is m2 methode of grandfather");
	}
}
	
	 class Parent extends Grandfather{
		
		void m1() {
			System.out.println("this is m1 methode of Parent");
		}
		void m3() {
			System.out.println("This is m3 methode of Parent");
		}
	}
	
	 class Child extends Parent{
		
		void m3() {
			System.out.println("This is M3 method of child");
		}
		void m4() {
			System.out.println("This is M5 method of Child");
		}
	}
	


