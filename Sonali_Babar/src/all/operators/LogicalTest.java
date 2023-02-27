package all.operators;

public class LogicalTest
{
	 static int a=10;
	 static int b=20;
	 
	 public static boolean exp()
	 {
		 return  a + 10 == b;// 10>=20    false
	 }
	 public static boolean exp1()
	 {
		 return b==20;
	 }

	public static void main(String[] args) 
	{
		if(LogicalTest.exp() && LogicalTest.exp1()) //here we use && or || operator
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
		
	}
}
