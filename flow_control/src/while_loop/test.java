package while_loop;

public class test {
	public static void main(String[] args) {
		
		for(int i = 1; i<10; i++) {
			
			for(int j=1; j<5; j++) {
				
				System.out.println("Devloper");
			}
		}
		
		 int[] arr = {10,20,34,25,65,45,78,95,2,3,56,2,1,6,26};
		 
		 for(int i=0;i<arr.length;i++) {
			 
			 if(arr[i]==10) {
				 System.out.println("index no . "+i);
				 
				 break;
			 }
		 }
	         
		 int[] arr1 = {10,20,34,25,65,45,78,95,2,3,56,2,1,6,26};
		 
		 for(int i=0;i<arr1.length;i++) {
			 
			 System.out.println("index no : "+i);
			 if(arr1[i]==2) {
				 System.out.println("these no is present  "+arr1[i]);
			 }
		 }
		  
		 int i = 1;
		 
		 do {
			 System.out.println(i);
			 i++;
		 }while(i<10);
		 
		 System.out.println(i);
		 
		// do - means once entry inside block(if exp is false) 
		 
		 int j = 1;
		 
		 do {
			 System.out.println(j);
			 j++;
		 }while(j>10);
		 
		 System.out.println(j);
		 
		 
		 
		 
	
	
	}
	
	

}
