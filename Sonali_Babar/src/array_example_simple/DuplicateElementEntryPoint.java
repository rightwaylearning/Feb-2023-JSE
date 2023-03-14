package array_example_simple;

public class DuplicateElementEntryPoint
{
	public static void main(String[] args) {
		
		int[] arr= {20,30,40,30,50,560,70,20};
		
		int[] finalArray=new int[arr.length];
	
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++) {
			if(finalArray[j]!=arr[i])
			{
				finalArray[j]=arr[i];
				break;
				
			}
			}
				
			}
		
		for (int i = 0;  i< finalArray.length; i++) {
			System.out.println(finalArray[i]);
			
		}
		}
	}


