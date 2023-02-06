package practice_01;

public class TeacherRefrence1 {
	
	StudentAdmition techerinfo(int rollno,String Name1,String BloodGroup1, int std1)
	{
	StudentAdmition p = new StudentAdmition();
			p.rollno=rollno;
			p.Name = Name1; 
			p.BloodGroup = BloodGroup1;
			p.std=std1;
			
	         return p;
	
	}
}
