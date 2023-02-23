package setter.getter.example12;

public class Patient 
{
	public static void main(String[] args) 
	{
		Doctor d=new Doctor();
		d.setRegNo(101);
		d.setName("Sonali");
		
		//int RegNumber=d.getRegNo();
		//String Name=d.getName();
		
		
		System.out.println(d.getRegNo());
		System.out.println(d.getName());
		
		
		
	}
	
	
	

}
