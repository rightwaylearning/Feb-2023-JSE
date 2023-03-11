package simple_array_programs;

public class CopyEvenArrayFromExistingArray {
	
	public static void main(String[] args) {
		ArrayCopyOpt opt=new ArrayCopyOpt();
		
 		//int[] inputArray = {12,34,56,78,90,43,46,68,80};
		int[] inputArray = {11,33,55};
		
 		int evenNumber=opt.returnSizeOfEvenElemnet(inputArray);
 		
 		if(evenNumber == 0) {
 			System.out.println("original array list");
 			opt.printArray(inputArray);
 			System.out.println();
 			System.out.println("sorry there is no any even number");
 		}else if(inputArray.length == evenNumber) {
 			System.out.println("ordignal array list");
 			opt.printArray(inputArray);
 			System.out.println();
 			System.out.println("Even Number Array List");
 			opt.printArray(inputArray);
 		}else {
 			int[] outputArray = new int[evenNumber];
 			int[] result = opt.copyArray(inputArray,  outputArray);
 			System.out.println("original Array");
 			opt.printArray(inputArray);
 			System.out.println("Even Number Array");
 			opt.printArray(result);
 			
 			
 		}
 		
		
	}
	

}
