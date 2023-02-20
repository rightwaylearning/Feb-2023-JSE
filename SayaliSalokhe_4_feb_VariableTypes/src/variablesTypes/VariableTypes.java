package variablesTypes;

public class VariableTypes {
	public static String clg_Name; //Static variable
	public String Student_name;    //instance variable
    public int roll_no;   //instance variable
	
	public void printInfo(String name,int no)
	{
		
		Student_name=name;
		roll_no=no;
		
		System.out.println(roll_no);
		System.out.println(Student_name);
		System.out.println(clg_Name);
	}
	
	
	
	

}
