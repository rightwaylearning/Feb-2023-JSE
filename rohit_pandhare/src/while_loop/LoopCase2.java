package while_loop;

public class LoopCase2 {
	
	public static void main(String[] args) {
		
		int i = 0 ;
		int value= 100;
		
		int[] arr = new int[5];
		
//		int[] is class of ref var arr so int[] madhe property
//		aahe length navachi tya mule length kalte size kalte
		System.out.println("length of array is = " +arr.length);

		//		arr[0] = 100;
		
		while (i < arr.length) {
			arr[i] = value;
             
			System.out.println(arr[i]);
		i++;
		value += 100;   //compound assignment value = value+100
        
		
		}
		
		LoopCase2 l = new LoopCase2();
		l.m1(arr);
		
	}
	
        public void m1(int[] arr) {
        	System.out.println("this is called by method");
        	
        	int i = 0 ;
        	while(i < arr.length) {
        		
        		System.out.println(arr[i]);
        		i++;
        		
        	}
        	
        }

}
