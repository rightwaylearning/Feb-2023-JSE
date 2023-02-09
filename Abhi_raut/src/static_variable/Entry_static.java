package static_variable;

public class Entry_static {
	
	public static void main(String[] args) {
		
	  Abhi s = new Abhi ();
	  
	  s.a = 10;
	  s.b = 20;
	  
	  Abhi s1 = new Abhi ();
	  s1.a = 100;
	  s1.b = 200;
	  Abhi.c = 300;
	  
	  
	  Abhi s2 = new Abhi ();
	  s2.a = 1000;
	  s2.b = 2000;
	  
	  System.out.println(Abhi.c);  // 300;
	  System.out.println(s.b);     // 20;
	  System.out.println(s1.c);
	  System.out.println(s2.c);
	}
	
	

}
