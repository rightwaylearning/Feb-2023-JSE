package child.parent.example;

public class Main {

	public static void main(String[] args) {
		
		GrandParent g = new Child();
		g.m2(); // o/p  I am m2 of Parent
		//g.m3(); // C.E
		//g.m4(); // C.E
		int h = g.hashCode();  
		System.out.println(h); // 305808283
		
		//----------------------------------
		
		// Parent p = new GrandParent(); // C.E
		
		GrandParent g1 = new Parent();
		 g1.m1(); // I am m1 of GrandParent
		// g1.m3(); 
		 g1.m2(); // I am m2 of Parent
		 g1.toString(); 
	}
}
