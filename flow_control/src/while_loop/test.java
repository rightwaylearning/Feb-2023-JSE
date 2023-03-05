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
			 
			 if(i==56) {
				 System.out.println("index no . "+i);
				 break;
			 }
		 }
	}

}
