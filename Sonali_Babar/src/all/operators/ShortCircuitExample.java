package all.operators;

public class ShortCircuitExample 
{
	public static void main(String[] args) 
	{ 
		Validate v=new Validate();
		
		
		if(v.isValid(25) && v.isIndian(91))
		{
			System.out.println("True");
		}
		else
		{
			System.out.println("False");
		}
		
	}

}
