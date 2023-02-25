package while_control_loop;

public class Example1 

{
	public static void loop1()
	{
		int i=1;
		while(i<=10)
		{
			System.out.print(" "+i+" ");
			i++;
		}
		System.out.println("");
	}
	
	public static void loop2()
	{
		int i=1;
		while(i<=10)
		{
			System.out.print(" "+i*2+" ");
			i++;
		}
		System.out.println("");
		
	}
	public static void loop3()
	{
		int i=1;
		while(i<=10)
		{
			System.out.print(" "+i*100+" ");
			i++;
		}
		System.out.println("");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Combination of while loop different Ouput");
		Example1.loop1();
		System.out.println("*********************************************");
		Example1.loop2();
		System.out.println("*********************************************");
		Example1.loop3();	
		
		
	}

}
