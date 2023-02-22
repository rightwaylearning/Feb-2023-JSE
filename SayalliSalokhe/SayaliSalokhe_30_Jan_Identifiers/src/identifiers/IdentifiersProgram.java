package identifiers; //Always start with small alphabets separate with . symbol

public class IdentifiersProgram //Always start with capital letter and it should be meaningfull
{
	//always contain  A...Z,a...z,0-9,$,_ symbols
	//always start with small alphabets
	String studentName="sayali"; 
	int roll_No=1;
  //int %roll_no=2; Error:Syntax error on token "%", delete this token
  //int 7Roll_No=3; Eroor:Syntax error on token "7", delete this token
	double _phoneN0=123456678;
	int $No;
  //String @name; Error:Syntax error on token "@", delete this token
	
	public void  m1() 
	{
	System.out.println("method m1");	
	}
	/*public void  m1() Error:Duplicate method m1() in type IdentifiersProgram
	{
	System.out.println("method m1");	
	}*/

}
