package imp.example.of.rule.overridemethod.parentobj;

public class Controller {
	
	public static void main(String[] args) {
		
		
//		parent class can hold child object
//		if child class not happy with parent class method defination then he will change
//		that method or will override method with new method defination
		
		
		GrandSon g = new GrandSon();
		
//		1.....rule first compile time g ref var type GrandSon class madhech baghte hi method 
//		aahe ka 
		g.m1(); //GrandSon method        ans GrandSon method m1
 		g.shareMarket();              // ans share market bhai GrandSon bussiness
		g.bussiness();                // ans son bussiness pattern
		g.m2();                       // ans old style
		
//		2... rule second run time madhe g ref karnare object madhe check karte hi method aahe
//		ka mag tyalach memory dya aani tyalach call kara
		
		
		System.out.println("<<<<<<<>>>>>>>>>>>><<<<<<<>>>>>>>>");
		
		
		Father f = new GrandSon();
		
//		2... rule second run time madhe f ref karnare object madhe check karte hi method aahe
//		ka mag tyalach memory dya aani tyalach call kara
		
		
		
		f.m1();                // ans GrandSon method m1
		f.bussiness();         // ans son bussiness pattern
		f.m2();                // ans old style
		
		
System.out.println("<<<<<<<>>>>>>>>>>>><<<<<<<>>>>>>>>");
		
		
		Father f1 = new Son();
		
//		2... rule second run time madhe f1 ref karnare object madhe check karte hi method aahe
//		ka mag tyalach memory dya aani tyalach call kara
		
		
		
		f1.m1();                // ans Son method m1
		f1.bussiness();         // ans son bussiness pattern
		f1.m2();                // ans old style
		f1.newPattern();        // ans Rule 1 compile time and Rule 2 run time 
		
		
		
	}

}
