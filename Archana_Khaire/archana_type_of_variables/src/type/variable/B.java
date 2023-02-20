package type.variable;

public class B {
	public static void main(String[] args) {
		
		CircleArea c = new CircleArea();
		c.pi = 3.14f;
		c.reduis = 1.5f;
		
		 float f = c.getCircleArea();
		 System.out.println(f);
	}

}
