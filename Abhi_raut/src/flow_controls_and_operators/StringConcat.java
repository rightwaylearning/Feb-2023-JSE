package flow_controls_and_operators;

public class StringConcat {
	
	static int rollnumber;
	static String name ;
	
	public static void main(String[] args) {
		
		StringConcat s = new StringConcat();
		s.rollnumber=41;
		s.name="Abhi";
		
		System.out.println("rollnumber= "+ rollnumber);
		System.out.println("name= "+ name);
		
		System.out.println(10+20+30+"20"+50+20); // 60205020
		
		
	}

}
