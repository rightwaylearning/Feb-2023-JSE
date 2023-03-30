package child.parent;

public class Main_ChildParent {
	public static void main(String[] args) {
		grandparent g=new grandparent();
		g.m1();
		g.m2();
	
	parent p= new parent();
	p.m2();
	p.m3();
	
	parent p1=new child();
	p1.m1();
	p1.m2();
	p1.m3();
	
	grandparent c= new child();
	c.m1();
	c.m2();
			

}
}