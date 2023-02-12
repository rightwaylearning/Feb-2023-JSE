package access.var.in.method;

public class Case2 {

	void m1() {
		
//		ithe access karaych aasel instance aaso static tari 
//		object create karav lagte 
		
			
			Case1 c = new Case1();
		   System.out.println(c.a);
		   System.out.println(c.b);
			
//			aasa pn karu shaktoh tari pn yala ekdach 
//			memory bhete 
			System.out.println(c.x);
			System.out.println(c.y);
		}
	
 static	void m2() {
		
//		ithe access karaych aasel instance aaso static tari 
//		object create karav lagte 
		
	           Case1.x =32;
			
			Case1 c1 = new Case1();
		   System.out.println(c1.a);
		   System.out.println(c1.b);
			
//			aasa pn karu shaktoh tari pn yala ekdach 
//			memory bhete 
			System.out.println(c1.x);
			System.out.println(c1.y);
		}

		
	}

