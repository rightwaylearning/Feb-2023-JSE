package else_if_example;

public class Controller {

	public static void main(String[] args) {
		
		Consultant c = new Consultant();
		ClassRoom obj = c.advise(23);
		Printer.print(obj);
	}
}
