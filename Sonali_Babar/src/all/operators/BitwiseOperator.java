package all.operators;

public class BitwiseOperator
{
	public static void main(String[] args) 
	{
		int a=10;
		int b=20;
		
		if(b<a | ++a > 10)// bitwise operator both conditions are check
		{
		a++;
		}
		else
		{
			b++;
		}
		System.out.println(a);//
		System.out.println(b);// 
		
		
	}

}
