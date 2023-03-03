package while_loop;

public class EntryPoint {
	
	public static void main(String[] args) {
		
//		int[] arr = new int[4];
		
		int[] arr = {20,32,40,50,60};
		
//		arr hai ref var mhnjech object aapn value aapn pass kela m1 method la
//		mg te value ghenar tikde
		
//		aani hi method call hoat aahe tya mule ethe value print hoil hi
//		aani jr return jr kela aasta tr tyala capture karav lagla aasta 
//		tya mule return nahi kela value
	    Printer.m1(arr);
	    
//	    aata hai print zal arr madhli value direct aata ya madhe aaplyala 100 add karaych ahe
	  
	    int i = 0 ;
	    
	    while(i < arr.length) {
	    	
	    	arr[i] = arr[i]+ 100;
	    	
	    
	             i++;
	    	
	    }
	    
//	    yacha aarth aasa hote
	    
//	    int[] arr = {120 ,132,140,150,160};
	    
	    Printer.m1(arr);
//	    System.out.println("<<<<<<<>>>>>>>>>>>>>>");
		
	}

}
