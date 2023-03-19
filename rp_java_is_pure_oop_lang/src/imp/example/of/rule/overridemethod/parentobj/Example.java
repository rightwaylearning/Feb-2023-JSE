package imp.example.of.rule.overridemethod.parentobj;


class Dadaji{
	
	void newPattern() {
		
		System.out.println("Rule 1 compile time and Rule 2 run time");
	}
	
	
	void m1() {
		System.out.println("Dadaji method m1");
	}
	
	void m2() {
		System.out.println("old style");
	}
}

class Father extends Dadaji{
	
	void m1() {
		System.out.println("Father method m1");
	}
	
	void bussiness() {
		System.out.println("old bussiness of father");
	}
	
	
}

class Son extends Father{
	
	void m1() {
		System.out.println("Son method m1");
	}
	
	void bussiness() {
		System.out.println("son bussiness pattern");
	}
	
}

class GrandSon extends Son{
	
	void m1() {
		System.out.println("GrandSon method m1");
	}
	
	void shareMarket() {
		System.out.println("share market bhai GrandSon bussiness");
	}
	
	
}


//main


public class Example {

	
	
}
