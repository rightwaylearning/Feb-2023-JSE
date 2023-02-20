package type.variables;

public class CircleAreaEntryPoint {
	
	public static void main(String[] args) {
		
		CircleArea C1 = new CircleArea();
		
		C1.pi=3.26f;
		C1.redius= 4.5f;
		
		float r1= C1.getCircleArea();
		System.out.println(r1);
		
		
		CircleArea C2 = new CircleArea();
		
		C2.pi= 3.26f;
		C2.redius=6.8f;
		float r2= C2.getCircleArea();
		System.out.println(r2);
		
		
		
	}

}
