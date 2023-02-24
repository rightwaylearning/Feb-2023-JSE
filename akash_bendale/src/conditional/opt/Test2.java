package conditional.opt;

public class Test2 {
	

		public static void main(String[] args) {
			
			int a = 100;
			int b = 200;
			
//			if(a>b) {
//				System.out.println("a is big element "+a);
//			}else {
//				System.out.println("b is big element "+b);
//			}
			
		
			int r = (a > b)? a:b;
			System.out.println("big element is  "+ r);
			
			
			
		}
	}

}
