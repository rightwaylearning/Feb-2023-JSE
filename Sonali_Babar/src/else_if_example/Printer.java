package else_if_example;

public class Printer 
{
	public static void printClassRoomInfo(ClassRoomInfo cr)
	{
		if(cr != null) {
		System.out.println("******ChildGroup Information************");
		System.out.println("Recommended Class_Room :"+cr.getClassRoom());
		System.out.println("AgeInMonth group  :"+cr.getLowerAge() +" >= Your Kid Age < "+ cr.getUpperAge());
		System.out.println("Annual Fees :"+cr.getFees());
		}
		else
		{
			System.out.println("Sorry Parents!... Your Child Age Is Not Mathched");
		}
		
	}

}
