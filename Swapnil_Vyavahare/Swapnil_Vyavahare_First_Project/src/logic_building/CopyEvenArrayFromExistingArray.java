package logic_building;

public class CopyEvenArrayFromExistingArray {

	public static void main(String[] args) {
		Arrayopt opt = new Arrayopt();	

		int[] inputarr = {184,4,78,8,5,8,4,58,78,47,58,78,9,6,8,6,158,6,586,5,5,56,5,8,5,25,8,5,4,88,8584,484,8,58,8484,45848,55};
		
		int evennumber = opt.getSizeOfEvenElement(inputarr);
		System.out.println(evennumber);
		
		if(evennumber==0) {
			System.out.println("originaal array");
			opt.printArray(inputarr);
			System.out.println();
			System.out.println("no any  even number");
			
		}else if (inputarr.length==evennumber) {
			System.out.println("originaal array");
			opt.printArray(inputarr);
			System.out.println();
			System.out.println("even number array");
			opt.printArray(inputarr);
		}else {
			int[] outputarray = new int[evennumber];
			int [] result = opt.copyArray(inputarr, outputarray);
			System.out.println("originaal array");
			opt.printArray(inputarr);
			System.out.println();
			System.out.println("even number array");
			opt.printArray(result);
			
		}

		

	}

	

	

}
