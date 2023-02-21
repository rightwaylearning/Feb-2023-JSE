package flow.controls;

public class EntryPoint {
	public static void main(String[] args) {
		
        Case1 c= new Case1();
       c.a = 322;
       c.b = 43;
       Case1.i = 32;
       
       c.m3(32,43);
//       ya madhe aapn ekach value return nahi karat aahot tr aaon khup sarya value
//       return karat aahot void madhe tya mule void haiexpression aasa
//       ghet nahit
       
//       aani rahili ghost return type chi tr tya madhe aapn ekach value
//       return karat aahot tya mule te true false madhe ans yete
	
//      if(c.m3(43, 22) > c.m2(43, 54)) {
//			
//			System.out.println("if true execute then only this statement get execute");
//			
//		}
//		
       c.m();
       
   if(c.m() > c.m1()) {
   	
   	System.out.println("hello sorry for this method aala aala ans aala");
   	
   }
   
   if(c.b()) {
		System.out.println("hello this is method if yes then call this method");
	}
   
	
		boolean flag = 10>8;
		
		if(flag) {
			
			System.out.println("if true execute then only this statement get execute");
			
		}
		
		System.out.println("else this statement will execute");
	}


}
