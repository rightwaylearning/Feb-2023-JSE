package while_control_loop;

public class Example5 
{
	public static void main(String[] args) {
		int[] arr=new int[10];
		
		int i=0;
		
		int value=100;
		
		while(i<arr.length)
		{
			arr[i]=value;
			value=value+100;
			i++;
		}
		 Example5.printNumber(arr);
		
	}
	public static void printNumber(int[] arr )
	{
		int i=0;
		while(i<arr.length) {
		
		System.out.println(arr[i]);
		i++;
		}
	}

}
