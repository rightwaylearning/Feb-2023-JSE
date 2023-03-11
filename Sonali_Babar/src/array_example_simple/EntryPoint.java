package array_example_simple;

public class EntryPoint 
{
	public static void main(String[] args) {
		EvenNumber obj=new EvenNumber();
		int[] arr= {1,40,5,70,9,80,680,4,346,8690};
		int evenSize = obj.evenNumberSize(arr);
		System.out.println("Even Number Size "+evenSize);
		  System.out.println("*********************************");
		System.out.println("Original Array..............");
        obj.printArray(arr);
		
		int[] EvenArray=new int[evenSize];
		
		if(evenSize==arr.length)
		{
			System.out.println("All Elements are Even");
		}
		else if(evenSize==0)
		{
			System.out.println("Even elements are not  present in given array");
			
		}
        obj.copyEvenArray(arr, EvenArray);
//        System.out.println("Original Array..............");
//        obj.printArray(arr);
        System.out.println();
        System.out.println("*********************************");
        System.out.println("Even Array......");
		obj.printEvenArray(EvenArray);
		
		
				
	}

}
