package all.operators;

public class ArithmaticOperator
{
	public static void main(String[] args) {
		byte a=10;
		byte b=20;
		
	int result=a+b; //upcasting
	System.out.println(result);
	
	short  a1=30;
	byte b1=20;
	int r=a1+b1;   //max(int,short,byte)   result type int
	System.out.println(r);
	
	int i=20;
	double d=20.2;
	
	int sum=(int)d+i; // downcasting
	System.out.println(sum);
	
	int num1=65;
	char ch='A';
	int sum1=num1+ch;
	System.out.println(sum1);
	
	
	
	}

}
