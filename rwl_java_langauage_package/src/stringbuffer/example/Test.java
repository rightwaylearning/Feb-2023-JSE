package stringbuffer.example;

public class Test {
	
	public static void main(String[] args) {
		
	// 1] SB b = new SB(); 16
		
		  StringBuffer br = new StringBuffer();
		  System.out.println(br.capacity()); // 16
		
		 br.append("abcabcabcabcabcpw");
		 System.out.println(br.capacity());
		 
		 // new capacity = (old capacity + 1)*2
		 br.append("aehfjhsdjkhdfsdjhfsdfdf");
		 System.out.println(br.capacity());
		 
		 //-----------------------------------------------------
		 
		// StringBuffer br1 = new StringBuffer(int capacity);
		 StringBuffer br1 = new StringBuffer(100);
		 System.out.println(br1.capacity()); // 100
		 br1.append("zskjdhfhszdkjfaskdfbkasjdfhkjhasdfjhsdkfhskdjfhsjkdfhkjsdhfjksdhfjksdhfjkshdfjkdshfjhsdjfkhsdjkfsajdfiurhfsadbvijeabdkjvsdbvkjsbdvbsdkjvb");
		 System.out.println(br1.capacity()); //202
		 
		 //-----------------------------------------------------
		 
		 String str = new String("abc");
		 // StringBuffer br2= new StringBuffer(String str);
		 
		 StringBuffer br2= new StringBuffer(str); // 3+ 16
		 System.out.println(br2.capacity());
		 
		 //--------------------------------------------------
		 StringBuilder b = new StringBuilder("abcae");
		 StringBuffer br3 = new StringBuffer(b); // 5 + 16
		 System.out.println(br3.capacity());
		 
		 //-----------------------------------------------------
		 // method of stringbuffer
		 //
		 StringBuffer br5 = new StringBuffer("abcd");
		 System.out.println(br5.length());
		 System.out.println(br5.capacity());
		 System.out.println(br5.charAt(2));
		 br5.setCharAt(2, 'C');
		 System.out.println(br5);
		 br5.deleteCharAt(2);
		 System.out.println(br5);  // abd
		 br5.reverse();
		 System.out.println(br5);
		 
		 
		 
		 StringBuffer br22= new StringBuffer("abcdefgh");

		 br22.delete(1,5);
		 
		 System.out.println(br22);
		 //---------------------------------
		 
		 StringBuffer br21= new StringBuffer("abcdefgh");
		 br21.setLength(3);
		 System.out.println(br21);
		 
		 //--------------------------------
		 StringBuffer br11= new StringBuffer("ab");
		 System.out.println(br11.capacity());
		 br11.trimToSize();
		 System.out.println(br11.capacity());
		 //------------------------------------
		 StringBuffer br31= new StringBuffer();
		 br31.append("ab");
		 System.out.println(br31.capacity());
		 br31.ensureCapacity(450);
		 System.out.println(br31.capacity());
	}

}
