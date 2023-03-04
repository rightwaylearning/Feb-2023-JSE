package while_loop;

public class Example2 
{
	public static void main(String[] args) {
		int num=1;
		while(num<=10)
		{
			if(num%2==1)
			{
				num++;
			}
			System.out.print(" "+num);
			num++;
		}
		System.out.println();
		System.out.println(num);
	}

}
