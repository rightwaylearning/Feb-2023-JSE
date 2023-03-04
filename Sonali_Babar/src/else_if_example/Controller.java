package else_if_example;

public class Controller {
	public static void main(String[] args)
	{
		Consultance c=new Consultance();
		ClassRoomInfo obj=c.advice(29);
		Printer.printClassRoomInfo(obj);
		
	}

}
