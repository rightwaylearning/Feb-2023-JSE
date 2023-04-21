package Class.Info;

interface Intern{
	void m1();
}
class A implements Intern{
	
	@Override
	public void m1() {
	}
}

class GetIntance{
	
 static	Intern getObject() {
		
		Intern i = new A();
		return i;
	}
}


public class PrintMyName {

	public static void main(String[] args) {
		
		PrintMyName m = new PrintMyName();
		System.out.println(m.getClass().getName());
		
		Intern i = GetIntance.getObject();
		System.out.println(i.getClass().getName());
	}
}
