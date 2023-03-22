package parentChildClassRelation;

public class GrandParentEntryPoint {
	public static void main(String[] args) {
		GrandParent g = new GrandParent();
		g.m1();
		g.m2();
		g.hashCode();
		//g.m4();
		System.out.println("=========================================================");
		GrandParent g1=new Parent1();
		g1.m2();
		g1.m1();
		//g1.m3(); //The method m3() is undefined for the type GrandParent
		g1.hashCode();
		g1.toString();
		System.out.println("=========================================================");
		GrandParent g2=new child();
		g2.m1();
		g2.m2();
		//g2.m3();
		//g2.m4();

	}

}
