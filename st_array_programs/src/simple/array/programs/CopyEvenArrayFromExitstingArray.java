package simple.array.programs;

public class CopyEvenArrayFromExitstingArray {
 
	public static void main(String[] args) {
		ArrayCopyOpt opt= new ArrayCopyOpt();
		
		
		int[] inputArray = {81,77,59,41};
		
		int evenNum = opt.returnSizeOfEvenElement(inputArray);
		
		if(evenNum == 0) {
			System.out.println("originaal array");
			opt.printArray(inputArray);
			System.out.println();
			System.out.println("sorry there is no any even number");
		}else if(inputArray.length == evenNum) {
			System.out.println("originaal array");
			opt.printArray(inputArray);
			System.out.println();
			System.out.println("Even Number array");
			opt.printArray(inputArray);
		}else {
			int[] outputArray = new int[evenNum];
			int[] result  = opt.copyArray(inputArray, outputArray);
			System.out.println("original array");
			opt.printArray(inputArray);
			System.out.println();
			System.out.println("Even Number array");
			opt.printArray(result);
		  }
		 }
        }