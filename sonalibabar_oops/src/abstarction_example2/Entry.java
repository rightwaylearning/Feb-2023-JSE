package abstarction_example2;

public class Entry {
	public static void main(String[] args) {
		//compiletime    runtime
		GrandParent g  = new Child();
		g.m1();
		g.m2();
//		g.m3();
//		g.m4();
        
		System.out.println("************************");
		
		GrandParent g1=new Parent();
		g1.m1();
		g1.m2();
//		g1.m3();
		
		System.out.println("************************");
		
		Parent p=new Child();
		p.m1();
		p.m2();
		p.m3();
		
	}

}
