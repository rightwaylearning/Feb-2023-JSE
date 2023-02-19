package area;

public class EntryPoint {
	public static void main(String[] args) {
		Circle.pi=3.14F;
        Circle c1=new Circle();
		c1.radius=4.623f;
		float area1=c1.circleArea();
		System.out.println(area1);
		
		Circle c2=new Circle();
		c2.radius=7.54F;
		float area2=c2.circleArea();
		System.out.println(area2);
		
	}

}
