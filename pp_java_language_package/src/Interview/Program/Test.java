package Interview.Program;

class A{
	@Override
	public int hashCode(){
		return 2;
	}
}

public class Test {
	
	public static void main(String[] args) {
		A a= new A();
		System.out.println(a.hashCode());
		
		A a1=new A();
		System.out.println(a1.hashCode());
		
		//-----------------------------------
		
		System.out.println(a1);
		System.out.println(a);// a.toString();
                              // getClass().getName()+"@"+Integer.tpHexString(hashCode());
	}

}
