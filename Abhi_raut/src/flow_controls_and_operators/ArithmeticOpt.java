package flow_controls_and_operators;

public class ArithmeticOpt {
	public static void main(String[] args) {
		
		// arithmetic operators [ + , - , * , / , % ]
		//formula = max(int, 1st data type, 2nd data type)=> choose max.(int is constant)
		
		byte a =10;
		byte b = 20;
    // byte c = a+b;  not convert int to byte ( see formula)
    // max(int , byte , byte )=> int is max then result type is int  
		int i = a+b;
		System.out.println(i);
		
		short s= 25;
		int v = 15;
		int r = v-s;  //(int is max.)
		System.out.println(r);
		
		float f = 25.0f;
		double d = f/2.0;  // (double is max.)
		System.out.println(d);
		
		char q ='B';
		int g = q*3;
		System.out.println(g);
		
		int n =81; 
	//	float j = n%8.0; ( not convert double to float)
		double j = n%8.0;  // ( % show reminder)
		System.out.println(j);
				
	}

}
