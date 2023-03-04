package var.arg.method;

public class VarArgMethodDemo 
{
	void add(int...product) //it is array 
	
	{
		int len=product.length; // 4
		
		System.out.println(len);
		System.out.println(product[len-1]);
		
		int index=0;
		int sum=0;
		while(index < product.length)
		{
			sum=sum+product[index];
			index++;
			
		}
		System.out.println("Total "+sum);
		
	}

	
}
