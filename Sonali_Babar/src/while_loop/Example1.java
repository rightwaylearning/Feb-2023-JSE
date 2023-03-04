package while_loop;

public class Example1
{
	public static void main(String[] args) {
		int num=1;
		while(num<=10)
		{
			if(num%2==0)
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
