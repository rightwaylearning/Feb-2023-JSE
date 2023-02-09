package practice_01;

public class EntryPoint {
	public static void main(String[] args) 
	{
		TeacherRefrence1 R = new TeacherRefrence1() ;
		StudentAdmition p= R.techerinfo(20,"vishakha","O+",10);
				p.printinfo();
	}
}
