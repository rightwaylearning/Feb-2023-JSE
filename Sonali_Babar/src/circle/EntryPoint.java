package circle;

public class EntryPoint
{
	public static void main(String[] arg)
	{
		CircleAreaMethod c=new CircleAreaMethod();
		c.pi=3.14f;
		c.radius=2.5f;
		
		float f=c.getCircleAreaMethod();
		System.out.println(f);
		
	}
	
	

}
