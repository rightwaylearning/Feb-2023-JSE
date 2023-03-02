package if_else_select_statements;

public class IfElse1 {

	public static void main(String[] args) {
		
		int a = 10;
		
		if(a==10)  {
			System.out.println("I am true part block");
		}else {
			System.out.println("I am false part block");
		}
		
		/*
		 int b = 20;
		 //Type mismatch: cannot convert from int to boolean
		 if(b=20){
			System.out.println("I am true part block");
		 }else {
			System.out.println("I am false part block");
		 }
		*/ 
		 
	
		 
		 boolean b1 = true;
		 
		  //Type mismatch: cannot convert from int to boolean
		 if(b1=false){
			System.out.println("I am true part block");
		 }else {
			System.out.println("I am false part block");
		 }
		 
		 if(b1==false){
			System.out.println("I am true part block");
		 }else {
			System.out.println("I am false part block");
		 }
		 
		
	}
}
