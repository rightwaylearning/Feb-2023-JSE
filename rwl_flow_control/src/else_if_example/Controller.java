package else_if_example;

public class Controller {

	public static void main(String[] args) {
		
		Consultant c = new Consultant();
		ClassRoom obj = c.advice(78);
		Printer.print(obj);
	}
}