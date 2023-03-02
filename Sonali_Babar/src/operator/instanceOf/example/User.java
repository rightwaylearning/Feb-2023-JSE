package operator.instanceOf.example;

public class User {
	                          //str = value //maths =value 
	public void caller(Object obj) //Object obj=new Object();
	                               //str= value of str is new String("Hello"); [Object obj=new String();]
	{
		if(obj instanceof String) {
		String s1=(String)obj;// String s1=new String("Hello");
		int i=s1.length();
		System.out.println("String "+s1);
		System.out.println("String Length "+s1.length());
		}
	
	if(obj instanceof MathsOpt) //maths 
	{
		MathsOpt m=(MathsOpt)obj; //maths value=new MathsOpt(); [MathsOpt m=new MathsOpt();]
		int r=m.square(100);
		System.out.println(r);
		
	}

}
}