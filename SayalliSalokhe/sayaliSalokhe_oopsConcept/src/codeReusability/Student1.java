package codeReusability;

public class Student1 extends Mathamatic {
	public void opration1(int a,int b)
	{
		Mathamatic mathamatic=new Mathamatic();
		int result=multiplication(a, b);
		System.out.println("result:"+result);
	}

}
