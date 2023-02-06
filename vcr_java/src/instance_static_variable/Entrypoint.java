package instance_static_variable;

public class Entrypoint {
	public static void main(String[] args) {
		Circle.pi=3.14F;// to assign static variable value.
		Circle C= new Circle();
		C.radius=2.2F;
		C.Carea();
		
		
		Circle C1= new Circle();
		C1.radius=4.2F;
		C1.Carea();
		
		
	}
	

}
