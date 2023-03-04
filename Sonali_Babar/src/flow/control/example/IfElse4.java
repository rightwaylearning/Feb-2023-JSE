package flow.control.example;

public class IfElse4 
{
	public static void main(String[] args) {
		
		int num=100;
		if(num==100)
		{
			int a=10;
			System.out.println(num);
			
			{
				int b=20;
				System.out.println(a);
			}
			System.out.println(b);
		}
		System.out.println(a);
	}

}
