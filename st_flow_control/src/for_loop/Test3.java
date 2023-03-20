package for_loop;

public class Test3 {
	
	public static void main(String[] args) {
		
		for(int i = 100; i>0; i = i-10 ) {
			System.out.println(i);
		}
	}

}

//  100> 0 = 100
// 100 - 10 = 90
// 90>0   -- i = 90- 10 = 80
//   -
//   -
//   -
// 10> 0 -- i = 10- 10 = 0