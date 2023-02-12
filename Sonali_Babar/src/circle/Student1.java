package circle;

public class Student1
{
	public static void main(String[] data)
	{
		Circle1 c1=new Circle1();  //object is instance of class
		
		Circle1.pi=3.14f;//when we have to assign value to the static variable then we declare class name.variable name=value;
		c1.radius=4.2f;//when we have to assign value to the instance variable then we declare object name.varaiblename=value.
		
		
		float r= c1.getCircle2();
		System.out.println(r);
		
		
		Circle1 c2=new Circle1();
		c2.radius=2.4f;
		
		float r1= c2.getCircle2();
		System.out.println(r1);
		}
	

}
