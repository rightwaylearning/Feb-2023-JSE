package static_variable;

public class entrypoint {
	public static void main(String[] args) {
		circlearea.pi=3.14f;
		circlearea c1= new circlearea ();	
		c1.redius = 2.5f;
				float r1=c1.getarea();
				System.out.println(r1);
				
				
				circlearea c2 =new circlearea();
				c2.redius=3.5f;
			float r2 =c2.getarea();
			System.out.println(r2);
		
	}

}

