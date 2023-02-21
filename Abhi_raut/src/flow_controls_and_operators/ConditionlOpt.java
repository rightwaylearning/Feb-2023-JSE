package flow_controls_and_operators;

public class ConditionlOpt {
	public static void main(String[] args) {
		
// syntax  ....r = (expression)?_______: ________;
		int a =10;
		int b = 5;
		
		int s = (a>b)? a:b;
		System.out.println("a is larger value= "+a);
		
		int c=100,d=200,e=300;
		
	/*	if(c>d) {
			System.out.println("c is larger than d = "+c);
			
		} else if(d>e) {
			System.out.println("d is larger than e = "+d);
		}else {
			System.out.println("e is larger than c and d = "+e);
		}*/
		
		int z = (c>d)?c:(d>e)?d:e;
		System.out.println(z);
		
		
	}

}
