package instance.stati.method.var.access;

public class EntryPoint {

	
    public static void main(String[] args) {
    	
   	 Case1 c = new Case1();
   	 c.a = 31;
   	c.b = 434;
   	Case1.x= 999;
   	Case1.y = 111;
   	
   	c.m1();
   	Case1.m2();
   	
   	Case1 c1 = new Case1();
  	 c1.a = 31;
  	c1.b = 434;
  	Case1.x= 999;
  	Case1.y = 111;
   	
  	c1.m1();
	Case1.m2();
	
	Case2 c2 = new Case2();
	c2.k1();
	
	c2.k2(); // but use className.k2 Case2.k2
	
	
	 
}

}
