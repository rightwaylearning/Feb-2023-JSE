package if_conditional_operator;
import java.util.Scanner;

public class If_Min_Max_Number {

	public static void main(String[] args) {
		//input=2
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 1st no: ");
		int num1=scan.nextInt();
		
		System.out.println("Enter 2nd no: ");
		int num2=scan.nextInt();
		
		
		//Minimum
		if(num1<num2) {
			System.out.println(num1+" is Minimum");
		}
		else {
			System.out.println(num2+" is Minimum");
		}
		
		//Maximum
		if(num1>num2) {
			System.out.println(num1+" is Maximum");
		}
		else {
			System.out.println(num2+"is Maximum");
		}
	}
	
}
