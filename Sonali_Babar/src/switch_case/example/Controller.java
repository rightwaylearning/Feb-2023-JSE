package switch_case.example;

public class Controller 
{
	public static void main(String[] args) {
		Consultance c=new Consultance();
		ClassRoomInfo obj=c.advice(26);
		Print.printInfo(obj);
		
		
	}

}
