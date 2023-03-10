package print.even.No;

public class LogicForPrinting {
	
	
	public int printEven(int[] arr) {
		
//		int[] arr = {}
//		arr[0] = 32;
		
		int index =0 ;
		
		int i = 0;
		
	   while(i<arr.length) {
		   
		   if(arr[i] %2 == 0) {
//		   System.out.println(arr[i]);
		   index++ ;
 	       }
		   i++;
	   }
		
	   return index;
		
	}
	
//	var-arg method
	public void m1(int... is) {
	
     for(int i= 0 ; i < is.length ; i++) {
			
			System.out.print(is[i]+ "  ");
			
		}
		
	}
	
	public int[] storeEven(int[] arr , int[] outPut) {
	
//		int[] arr = new int[] ;

		int j = 0;
		
		for(int i = 0 ; i < arr.length ; i++) {
			
			if(arr[i]%2 == 0) {
				
				outPut[j] = arr[i];
				j++;
			}
		}
		
		return outPut;
		
	}
	
	public void printElement(int[] result) {
		
          int i = 0;
		
		for(i= 0 ; i < result.length ; i++) {
			
			System.out.println("outPut"+"["+ i +"]"+" = " + result[i]);
			
		}
	}
	
	

}
