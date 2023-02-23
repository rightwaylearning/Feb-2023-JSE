package variable.local_variable_declarartion;

public class Test {
	public int a;
	public int b;
	
	void m1()
	{
		int a=100;  //first search instance variable a in method 
		System.out.println(a);//so output of a is 100 not 1
		System.out.println(b);
	}

}
