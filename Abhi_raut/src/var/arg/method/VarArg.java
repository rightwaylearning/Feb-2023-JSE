package var.arg.method;

public class VarArg {
     // var-arg method 
		
	public void sum(int... add)	{
		
		int i=0;
		
		
		while(i<add.length) {
			System.out.println(add[add.length-1]);
			
		}
		
		
	}
}
