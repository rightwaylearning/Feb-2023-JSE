package type_variable_static;

public class EntryPoint {

		public static void main(String[] args) {
			
			Circle.pi = 3.14F; // static variable have single copy of memory
			
			Circle c1= new Circle();
			c1.redius = 3.4F;
			float r1 = c1.getArea();
			System.out.println(r1);
			
			
			Circle c2 = new Circle();
			c2.redius = 5.6F;
			float r2 = c2.getArea();
			System.out.println(r2);
			
			
			
			
		}
	}

