package type.variable_static;

public class Entrypoint {
	
	public static void main(String[] args) {
		CircleArea c= new CircleArea();
		c.pi=3.14f;
		c.redius=5.0f;
		
	float r =c.getCircleArea();
	
       CircleArea c1= new CircleArea();
       c1.pi=3.14f;
       c1.redius=8.0f;
       float r1=c1.getCircleArea();
       
       System.out.println(r);
       System.out.println(r1);
	}

}
