package all.operators;

public class LogicalAndOR
{
  public static void main(String[] args) 
  {
	  int age=15;
	  if(age>=18 && age<=30)  //  AND && Operator
	  {
		  System.out.println("You are Eligible for Voting");
	  }
	  else
		  System.out.println("Sorry....You are not Eligible For Voting");
	  
	  System.out.println("**********************************");
	  
	  int num=10;
	  if((num%2==0) || (num%3==0))   // OR || Operator
	  {
		  System.out.println("Number is Divisible");
	  }
	  else
		  
	  System.out.println("Number is Not Divisible");
	
}
}
