package identifiers;

public class DuplicateMethods {
	
	public void  m1() 
	{
		System.out.println("hii");
	}
	/*public void m1() Error:Duplicate method m1() in type DuplicateMethods
	{
		System.out.println("heloo");
	}*/
	public static void  main(String[] args) {
		DuplicateMethods d=new DuplicateMethods();
		d.m1();
		d.m1();
	}

}
