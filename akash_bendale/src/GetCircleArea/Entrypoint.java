package GetCircleArea;

public class Entrypoint {
	public static void main(String[] args) {
		CircleArea.pi=3.14F;
		 
		 CircleArea c1 =new CircleArea();
		 c1.redius = 3.4F;
		 float r1 = c1.getArea();
		 System.out.println(r1);
		 
		 CircleArea c2=new CircleArea();
			c2.redius =5.6F;
		 float r2 = c2.getArea();
		 System.out.println(r2);
	}

}
