package variable_This_keyword;

public class ThisKeyword {
	public int a;
	public int b;
	
	public void simple()
	{
		int a=999;
		int b=111;
		System.out.println("loacal variable a:"+a);// local variable a=999
		System.out.println("a call by refernce t1:"+this.a);//Reference variable call by t1 a=300
		System.out.println("loacal variable b:"+b);//Local variable b=111; 
		System.out.println("b call by refernce t1:"+this.b);//Reference variable call by t1 b=444
	}

}
