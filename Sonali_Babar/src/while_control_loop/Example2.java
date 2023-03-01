package while_control_loop;

public class Example2 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[5];
		arr[0]=100;
		arr[1]=200;
		arr[2]=300;
		arr[3]=400;
		arr[4]=500;
		
		
		System.out.println("Array Length "+arr.length);
		int i=0;
		while(i<5)
		{
			System.out.print(" "+arr[i]);
			i++;
			
		}
		
	}

}
