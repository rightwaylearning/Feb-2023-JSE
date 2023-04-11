package poly_example;




public class Case1 {

	
void m1(int c) {
		
		System.out.println("int primitive");
	}
	
	
	void m1(int a ,float b) {
		System.out.println("int,float");
	}
	
	void m1(float a ,float b) {
		System.out.println("float,float");
	}
	
	void m1(float b,int a ) {
		System.out.println("float,int");
	}
	
	
	void m1(C c) {
		
		System.out.println("C class");
	}
	

	
void m1(Object obj) {
		
		System.out.println("Object Class");
	}

void m1(Integer i) {
	
	System.out.println("Integer Class");
	
}
	
void m1(char ch) {
	
	System.out.println("char primitive data type");
	
}

void m1(Number c) {
	
	System.out.println("Number class");
}


	
}
