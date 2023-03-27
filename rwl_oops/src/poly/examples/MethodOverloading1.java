package poly.examples;

public class MethodOverloading1 {

	void m1(int a, int b) {
		
	}
	
	void m1(float a, float b) {
		
	}
	// 1]base: different type parameter
	
	//----------------------------------
	
	void m1(int a, int b,int c) {
		
	}
	// 2] base: number of parameter count is different
	
	//-------------------------------------------
	
	void m1(int a, float b) {
		
		System.out.println("Hi hello ");
	}
	
	void m1(float b, int a) {
		
	}
	// base:- sequence of parameter is different
}


// 1] type 2] number of parameter 3] sequence 




