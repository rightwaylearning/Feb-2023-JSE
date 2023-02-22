package all.operators;

public class IncrementDecrement 
{
	public static void main(String[] args)
	{
		int a=10;//11
		int b=20;//21//22
		int c= a++ + b++ + ++b;
		     //10  + 20  + 22 =52
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println("<------------------Increment------------------------>");
		
		int a1=20;//21//22
		int b1=20;//21//22
		int c1=a1++ + ++b1 + ++a1 + ++b1;
		    // 20   +  21   + 22  +  22 = 85 
		System.out.println(a1); //22
		System.out.println(b1);//22
		System.out.println(c1);//85
		
		System.out.println("<--------------Decrement--------------------->");
		
		int x=10;//9//10 
		int y=15;//14//15
		int z= --x + y-- - x++ + ++y;
		     //9   + 15  - 9   + 15  = 30
		System.out.println(x);//10
		System.out.println(y);//15
		System.out.println(z);//30
		
		
		
	}

}
