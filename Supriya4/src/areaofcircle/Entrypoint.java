package areaofcircle;

public class Entrypoint {
	public static void main(String[] args) {
		CircleArea c=new CircleArea();
	    c.radius=3.4f;
	    CircleArea.pi=3.14f;
	     
	    float r=c.getCircleArea();
	    System.out.println(r);
	}

}




