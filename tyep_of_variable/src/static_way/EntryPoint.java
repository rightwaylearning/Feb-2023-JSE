package static_way;

public class EntryPoint {

	public static void main(String[] args) {
		
		MySystem.out.myPrint("hello");
		
		// MySystem
		// >> MySystem is class having one static property , named out of type
		   //    MyStream
		
		//out
		 // out is reference variable of type MyStream but currently available inside 
		// MySystem as static property 
		
		// myPrint
		 // it is instance method of MyStream.
		
		
		
	}
}
