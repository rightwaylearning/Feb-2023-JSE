package type.of.variable;

public class EntryPoint {
	
	public static void main(String[] args) {
		
//		without creating object if u want to call variable then go with
//		static variable static having single memory declaration
		
		Static.z = 3232;
		
		Static s = new Static();
		
		s.a = 32;
		s.b = 23;
		
		Static s1 = new Static();
	 
		 s1.a = 54;
		 s1.b = 55;
		 
		 s1.m1();
		 
		 Static.m2();
	
		 System.out.println("this is static call" +Static.z);
		 System.out.println(s.z);
		 System.out.println(s1.z);
	
	}

}
