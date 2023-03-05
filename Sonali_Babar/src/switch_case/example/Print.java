package switch_case.example;

public class Print {
	
	public static void printInfo(ClassRoomInfo cr)
	
	{
		System.out.println("Recommened Class "+ cr.getClassRoom());
		System.out.println("AgeInMonth "+cr.getLowerAge() +" >= Your Chid Age < "+cr.getUpperAge());
		System.out.println("Annual Fees "+cr.getFees());
		
	}

}
