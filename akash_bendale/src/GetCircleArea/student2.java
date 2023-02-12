package GetCircleArea;

public class student2 {
	public static void main(String[] args) {
		CircleArea c= new CircleArea();
		
		c.pi=3.14F;
		c.redius=5.7F;
		
		float result = c.getcircleArea();
		System.out.println(result);
	}

}
