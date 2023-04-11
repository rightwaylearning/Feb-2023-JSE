package poly.examples;

public class MethodOverloading1 {
	
	void m1(int a, int b) {
		
	}
	
	void m2(float a,float b) {	
	}
	//1]Case: different type Parameter.
	//----------------------------------
	
	void m1(int a, int b, int c){
	}
   //2]Case: No.of parameter Count is different.
	
	void m1(int a,float b) {		
		System.out.println("Hi,Hello");
	}
	
	void m1(float b, int a) {		
	}
	//3]Case:Sequence of parameter is different.
}

//1] Type 2] Number of Parameter 3] Sequence


