package overriding_Rule;

class A1
{
	int  m1(int a)
	{
		return a;
		
	}
}
class B1 extends A1
{
	@Override
	int m1(int b)
	{
		return b;
		
	}
	
	}
public class Rule2_UseOverrideAnnotation {
	public static void main(String[] args) {
		
	}

}
