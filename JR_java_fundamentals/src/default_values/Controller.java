package default_values;

public class Controller {
	
	public static void main(String[] args) {
		
		
		Test t= new Test();
		
		System.out.println("byte ="+t.getB());
		System.out.println("short ="+t.getS());
		System.out.println("int="+t.getI());
		System.out.println("long ="+t.getL());
		
		System.out.println("float ="+t.getF());
		System.out.println("double ="+t.getD());
		
		System.out.println("char ="+t.getC());
		System.out.println("boolean="+t.getB1());
		
		System.out.print("String str="+t.getStr());
		
		
	}

}
