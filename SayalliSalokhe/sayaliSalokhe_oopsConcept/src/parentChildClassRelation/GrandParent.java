package parentChildClassRelation;

public class GrandParent {
	public void m1() {
		System.out.println("I am m1 of GrandParent");
	}

	public void m2() {
		System.out.println("I am m2 of GrandParent");
	}

}

class Parent1 extends GrandParent {
	public void m2() {
		System.out.println("I am m2 of Parent");
	}

	public void m3() {
		System.out.println("I am m3 of Parent");
	}
}

class child extends Parent1 {
	public void m3() {
		System.out.println("I am m3 of Child");
	}

	public void m4() {
		System.out.println("I am m4 of Child");
	}

}
