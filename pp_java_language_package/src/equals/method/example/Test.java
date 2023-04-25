package equals.method.example;

class Me{
	int x;
	int Y;
	public Me(int x, int y) {
		super();
		this.x = x;
		Y = y;
	}
	
}

public class Test {
	
	public static void main(String[] args) {
		Me m1= new Me(10,20);
		
		Me m2=new Me(10,20);
		
		Me m3= new Me(30,40);
		m3=m1;
		
		boolean r1= m1.equals(m2);
		
		System.out.println(r1);
		
		
		System.out.println(m1.equals(m3));
		
		System.out.println(m2.equals(m3));
	}

}
