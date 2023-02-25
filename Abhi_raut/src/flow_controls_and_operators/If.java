package flow_controls_and_operators;

public class If {
		public static void main(String[] args) {
			
			// if (expression)
		
			int a = 100;
			int b = 200;
			
			if(b>a) { 
				System.out.println("b is greater than a, b is 200");				
			}
			
			if(b<a) {
				System.out.println("b is smaller than a , a is 100" );
			}
						
			int s = a+b;
			System.out.println(s);
			
			Test t = new Test();
			
			if(t.m1(100, 200)) {
				System.out.println("x is greater than y");
			}
			
				System.out.println("y is greater than x");
				
					
		
	}

}
