package property_level_modifiers;

public class Case4Ans {
	
	public static void main(String[] args) {
		
		Case4Static c = new Case4Static();
		
//		c.name = "hello";
//		c.m1();
		 
		Case4Static.name = "hello1Static";
		
		Case4Static.name = "hello1Static33";
		
		System.out.println(Case4Static.name);
		
		Case4Static.m1();
		
	}

}
