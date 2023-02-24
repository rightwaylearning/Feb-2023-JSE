package set.get.method3;

public class result {
	 
	public static void main(String[]data) {
	
		studentImformation d= new studentImformation ();
		d.setStudentName("sachin");
		d.setRollNumber(10);
		
		
		String studentname= d.getStudentName();
		int rollnumber= d.getRollNumber();
		
		System.out.println(d.getStudentName ());
		System.out.println(d.getRollNumber());
		 
	}
	

}
