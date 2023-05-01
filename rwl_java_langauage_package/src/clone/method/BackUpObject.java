package clone.method;

class A implements Cloneable{
	public int x;
	public int y;
	public String text;
	
	public A() {}

	public A(int x, int y, String text) {
		super();
		this.x = x;
		this.y = y;
		this.text = text;
	}
	
	public Object doCloning() throws Exception {
	  return this.clone();
	}
	
	// OR
	/*
	 * @Override protected Object clone() throws CloneNotSupportedException { return
	 * super.clone(); }
	 */
	
}


public class BackUpObject {

	public static void main(String[] args) throws Exception {
		
		A a= new A(10, 20, "Virat");
		
		A d = (A)a.doCloning();
		d.x = 78;
		d.text = "Rohit";
		
		
		System.out.println(a.x);
		System.out.println(a.text);
		System.out.println("-------------------------");
		System.out.println(d.x);
		System.out.println(d.text);
		
	}
}
