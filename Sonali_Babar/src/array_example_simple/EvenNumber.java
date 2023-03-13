package array_example_simple;

public class EvenNumber {
	int size = 0;

	public int evenNumberSize(int[] arr) 
	
		{
			for (int i = 0; i < arr.length; i++)
			{                                             // 20,30,25,70,67,90
				if (arr[i] % 2 == 0) 
				{
					size++;
				}
			}
			return size;

		}
       
	public void copyEvenArray(int[] arr,int[] EvenArray)     // 20,30,25,70,67,90
	{
		int j=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0) {
			EvenArray[j]=arr[i];
			j++;
			}
		}
		
	}
	public void printArray(int[] arr)
	{
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public void printEvenArray(int[] EvenArray)                   // 20,30,25,70,67,90
	{
		for(int i=0;i<EvenArray.length;i++) {
			System.out.print(EvenArray[i]+" ");
		}
		
	}
	
	
	
		
		
		
		
	}


