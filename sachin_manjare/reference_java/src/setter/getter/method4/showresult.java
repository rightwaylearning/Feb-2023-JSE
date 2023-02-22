package setter.getter.method4;

public class showresult {
	 
	public static void main(String[]data) {
		
		displyresult d = new displyresult ();
	  d.setName("sachin");
	  d.setRollNumber(11);
	  d.setMathsmark(70);
	  
	  String name= d.getName();
	 int rollNumber= d.getRollNumber();
	int mathsmark= d.getMathsmark();
	 
	  
       System.out.println( d.getName() );
	
       System.out.println( d.getRollNumber());
       System.out.println(d.getMathsmark());

		
		
		
		
		
		
		
	}

}
