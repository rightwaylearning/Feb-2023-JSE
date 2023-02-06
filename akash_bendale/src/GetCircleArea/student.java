package GetCircleArea;

public class student {
	public static void main(String[] args) {
		CircleArea c = new CircleArea();
			
			c.pi=3.14F;
		c.redius=34.56F;
		
		float result = c.getcircleArea();
		System.out.println(result);
		
	}

}
