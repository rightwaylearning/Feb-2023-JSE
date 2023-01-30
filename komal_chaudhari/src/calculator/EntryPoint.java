package calculator;

public class EntryPoint {
	
	public static void main(String [] args)
	{
		cal m = new cal();
		m.a = 100 ;
		m.b = 200 ;
		
		int r = m.sum();
		System.out.println(r);
	}
}
