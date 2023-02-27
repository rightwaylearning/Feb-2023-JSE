package while_control_loop;

public class Example4 
{
	public static void main(String[] args) 
	{
		int i=1;
		while(Example4.valiDateNumber(i))
		{
			System.out.println(i);
			i++;
		}
		
	}
	
	public static boolean valiDateNumber(int i)
	{
		boolean r=i<=10;
		return r;
		
		
		
	}

}
