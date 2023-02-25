package calculations;

public class Calculation {
	private int a;
	private int b;

	public Calculation() {
		super();
		// TODO Auto-generated constructor stub
	}
	

	public Calculation(int a) {
		super();
		this.a = a;
		System.out.println(a*a);
	}


	public Calculation(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a/b);
		System.out.println(a%b);
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

}
