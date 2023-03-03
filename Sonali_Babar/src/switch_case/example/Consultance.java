package switch_case.example;

public class Consultance 
{
	public ClassRoomInfo advice(int ageInMonth)
	{
		ClassRoomInfo classRoom=null;
		
		switch(ageInMonth)
		{
		case(ageInMonth >=24  && ageInMonth < 36):
		{
			classRoom=new ClassRoomInfo("PayGroup",24,36,40000.00);
			
		}case(ageInMonth >=36  && ageInMonth < 48):
		{
			classRoom=new ClassRoomInfo("PayGroup",36,48,45000.00);
			
		}case(ageInMonth >=48  && ageInMonth < 60):
		{
			classRoom=new ClassRoomInfo("PayGroup",48,60,50000.00);
			
		}case(ageInMonth >=60  && ageInMonth < 72):
		{
			classRoom=new ClassRoomInfo("PayGroup",60,72,60000.00);
			
		}
		default:
			System.out.println("Sorry......! Your Child Age is Not Matched ");
		
		}
		
		return classRoom;
		
	}
	
}
