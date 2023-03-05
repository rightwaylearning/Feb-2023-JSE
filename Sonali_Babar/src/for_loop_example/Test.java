package for_loop_example;

public class Test {
	
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
			System.out.print(" "+i);
		}
		System.out.println();
		System.out.println("****************************");
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i*2);
		}
		
		System.out.println();
		System.out.println("****************************");
		for(int i=1;i<=10;i++)
		{
			System.out.print(" "+i*2*2*2);
		}
		
		System.out.println();
		System.out.println("****************************");
		for(int i=1;i<=10;i=i+2)
		{
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println("****************************");
		for(int i=10;i>=1;i--)
		{
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println("****************************");
		for(int i=10;i>=1;i--)
		{
			System.out.print(" "+i*10);
		}
	}

}
