package print.even.No;

public class EntryPoint {
	
	public static void main(String[] args) {
		
		LogicForPrinting l = new LogicForPrinting() ;
//		int[] arr1 = {43,32,23,43,54,98,65,67,787,87,65,45,434,4343,4343,43};
//        l.m1(arr1);		
		
		int[] arr = {2,4,8,10};
		
		int size = l.printEven(arr);
	
		System.out.println("Original array");
		l.m1(arr);
		System.out.println();
		
		if(size == 0 ) {
			
			System.out.println("Sorry Boss sab odd hai yeh print nahi ho sakta");
		}
		else if(arr.length == size) {
			
			 		
			
		System.out.println("Even array print Result");
		l.m1(arr);
		}else{
			
		
		System.out.println("size of even array " + size);
		int[] outPut = new int[size];
		
		System.out.println("<<<<<<<<<<<this is data for printing even elements>>>>>>>>>>>>>");
		int[] result = l.storeEven(arr, outPut);
		
		
//		System.out.println(result[0]);
		
		l.printElement(result);
		}
//		System.out.println(printData);
		
		
		
	}

}
