package conditional_opt;

public class B {
 
public static void main(String[] args) {
	
	int a =100;
	int b= 200;
	int c= 3000;
	
	//if(a>b&& a>c) {
		
		//System.out.println("a is big element a+");
		//} else if(b>a&&b>c){
//	System.out.println("b is a big element b+");
	//	}else	
	//System.out.println("c is a big element c+");

	int result = (a > b && a > c)? a:(b > a && b > c)? b:c;
	System.out.println("big element is "+ result);
	
	

}




}
	
	
	
	

