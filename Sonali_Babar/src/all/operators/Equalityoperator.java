package all.operators;

public class Equalityoperator 
{
public static void main(String[] args) 
{
	int a=10;
	int b=10;
	
	System.out.println("*****Equality Operator*****");
	
	System.out.println(a==b);
	
	System.out.println('A'+1 =='B');
	System.out.println(20==20.0);
	
	System.out.println(true==true);
	// System.out.println(10>5<20); not allowed 
	
	System.out.println(true == (10<5));// allowed 
	
	System.out.println("**Not Equal To Operator**");
	System.out.println(30 != 110);
	
	System.out.println(a!=b);
	System.out.println(10.00 != 40);
	
	
	
	
}

}
