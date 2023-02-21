package flow_controls_and_operators;

public class AssigmentOpt {
	public static void main(String[] args) {
		
	
	
	// case1 - primitive type and reference type 
	
	int a = 10;
	
	// case2 - chain assignment
	
	int b,c,d,e;
	b=c=d=e=40;
	
	// case3 - compound Assignment
	
	int z= 10;
	z +=10;    // z= (int)z+10;
	System.out.println(z);
	
	int l = 100;
	l*=10;   //1000
	l-=100;  //900
	l/=9;    //100
	l+=10;   //110
	
	System.out.println(l);//110
	
	}
}
