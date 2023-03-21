package parentChildClassRelation;

public class ParentEnteryPoint {

	public static void main(String[] args) {

		// --------------Case1-----------------------------------------------------------
		// Parent compile time reference and parent runtime object.
		ParentFirst p = new ParentFirst();
		p.HomeConstruction(); // old Construction
		p.Fund();
		System.out.println("=========================================================");
		// p.OwnBussiness(); The method OwnBussiness() is undefined for the type Parent

		// ---------------Case2--------------------------------------------------------------
		// child compile time reference and child runtime object.
         Child c = new Child();
		c.HomeConstruction(); // New Construction
		c.Fund();
		c.OwnBussiness();
		System.out.println("=========================================================");

		// ---------------Case3----------------------------------------------------------------
		// Parent compile time reference and child runtime object.
		// Best Way
		ParentFirst p1 = new Child();
		p1.HomeConstruction();
		p1.Fund();
		// p1.OwnBussiness();//he method OwnBussiness() is undefined for the type Parent
		System.out.println("=========================================================");

		// -----------------Case4----------------------------------------------------------------
		// Child compile time reference and parent runtime object.but child can't hold
		// the parent object
		// Child c1=new parent(); //CE=parent cannot be resolved to a type

	}
}
