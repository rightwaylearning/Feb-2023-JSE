package parentChildClassRelation;

public class Parent {
	public void HomeConstruction() {
		System.out.println("Old Construction.........");
	}

	public void Fund() {
		System.out.println("300000 fund");
	}
}

class Child extends Parent {
	public void HomeConstruction() {
		System.out.println("New Contruction");

	}

	public void OwnBussiness() {
		System.out.println("own Bussiness");

	}

}
