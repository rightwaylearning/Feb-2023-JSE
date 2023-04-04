package Methode_overloding;

public class Main_ovetload {
	
	public static void main(String[] args) {
		
		Grandfather GF=new Grandfather();
		GF.m1();
		//GF.m3();
		GF.m2();
		
		System.out.println("----------Grandfather g=new Parent()-------------");
		
		Grandfather g=new Parent();
		g.m1();
		//g.m3();
		g.m2();
		
		System.out.println("----------Parent p=new Child();-------------");
		
		Parent p=new Child();
		
		p.m1();
		p.m2();
		p.m3();
		//p.m4();
		
		System.out.println("----------Child c=new Child();-------------");
		
		Child c=new Child();
		
		c.m3();
		c.m4();
		
		
	}

}
