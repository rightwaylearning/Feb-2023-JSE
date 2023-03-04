package else_if_example;

public class Consultance 
{
	public ClassRoomInfo advice(int ageInMonth)
	{
		ClassRoomInfo classRoom=null;
		
		if(ageInMonth >=24  && ageInMonth < 36)
		{
		 classRoom = new ClassRoomInfo("PlayGroup",24,36,40000.00);
		}
		
		else if(ageInMonth >=36  && ageInMonth < 48)
		{
		 classRoom = new ClassRoomInfo("Nursery",36,48,45000.00);
		}
		
		else if(ageInMonth >=48  && ageInMonth < 60)
		{
		 classRoom = new ClassRoomInfo("LKG",48,60,50000.00);
		}
		else if(ageInMonth >=60  && ageInMonth < 72)
		{
		 classRoom = new ClassRoomInfo("UKG",60,72,60000.00);
		}
		return classRoom;
	}

}
